package com.example.jetpackcomposecoursedemofirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import com.example.jetpackcomposecoursedemofirst.ui.theme.CustomDimens.CustomDimensWithDp.Companion.tenDp
import com.example.jetpackcomposecoursedemofirst.ui.composables.GreetingComposable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val textModifier = Modifier
                .verticalScroll(state = rememberScrollState())
                .padding(tenDp)
            val names = arrayOf("Android", "IOS", "Web")
            GreetingComposable(
                name = names,
                modifier = textModifier
            )
        }
    }
}
