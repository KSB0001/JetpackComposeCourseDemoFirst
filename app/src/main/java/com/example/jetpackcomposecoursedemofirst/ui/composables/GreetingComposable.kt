package com.example.jetpackcomposecoursedemofirst.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecoursedemofirst.ui.theme.CustomDimens.CustomDimensWithDp.Companion.tenDp
import com.example.jetpackcomposecoursedemofirst.ui.theme.CustomDimens.CustomDimensWithDp.Companion.thirtySixDp
import com.example.jetpackcomposecoursedemofirst.ui.theme.CustomDimens.CustomDimensWithSp.Companion.eighteenSp
import com.example.jetpackcomposecoursedemofirst.ui.theme.JetpackComposeCourseDemoFirstTheme

@Composable
internal fun GreetingComposable(name: Array<String>, modifier: Modifier = Modifier) {
    val onClickAndroid = {}
    val onClickIos = {}
    val onClickWeb = {}
    val reusableColumnModifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan)
        .padding(top = thirtySixDp, start = tenDp)
    Column(modifier = reusableColumnModifier) {
        Text(
            text = "Hello ${name[0]}!",
            fontSize = eighteenSp,
            color = Color.Black,
            modifier = modifier.clickable(onClick = onClickAndroid)
        )
        Text(
            text = "Hello ${name[1]}!",
            fontSize = eighteenSp,
            color = Color.Black,
            modifier = modifier.clickable(onClick = onClickIos)
        )
        Text(
            text = "Hello ${name[2]}!",
            fontSize = eighteenSp,
            color = Color.Black,
            modifier = modifier.clickable(onClick = onClickWeb)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeCourseDemoFirstTheme {
        val names = arrayOf("Android", "IOS", "Web")
        GreetingComposable(names)
    }
}
