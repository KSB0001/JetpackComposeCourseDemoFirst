package com.example.jetpackcomposecoursedemofirst.ui.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecoursedemofirst.ui.theme.JetpackComposeCourseDemoFirstTheme

@Composable
internal fun GreetingComposable(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeCourseDemoFirstTheme {
        GreetingComposable("Android")
    }
}
