package com.example.recipeapp.presentation.ui.recipe_list.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FoodCategoryChip(
    category: String,
    isSelected: Boolean = false,
    onSelectedCategoryChanged: (String) -> Unit,
    onExecuteSearch: () -> Unit
) {
    Surface(
        modifier = Modifier
            .padding(end = 8.dp)
            .toggleable(
                value = isSelected,
                onValueChange = {
                    onSelectedCategoryChanged(category)
                    onExecuteSearch()
                }
            ),
        elevation = 8.dp,
        shape = MaterialTheme.shapes.medium,
        color = if(isSelected) Color.LightGray else MaterialTheme.colors.primary
    ) {
        Text(
            modifier = Modifier.padding(8.dp),
            text = category,
            style = MaterialTheme.typography.button,
            color = Color.White,
        )
    }
}