package com.example.calcultaoreasy1

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calcultaoreasy1.ui.theme.Calcultaoreasy1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calcultaoreasy1Theme {
                Cal()

            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Cal(modifier: Modifier = Modifier) {
    val myColor = Color(0xFFD50000)
    val myColor2 = Color(0xFF0091EA)
    val myColor3 = Color(0xFFAA00FF)
    val myColor4 = Color(0xFFD50000)
    val myColor5 = Color(0xFF00C853)
    val myColor6 = Color(0xFFF86B3F)
    val myColor7 = Color(0xFF00838F)



    val context = LocalContext.current
    var num1 by remember {
        mutableStateOf("")
    }

    var num2 by remember {
        mutableStateOf("")
    }


    Column(modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        TextField(
            value = num1, onValueChange = {num1 = it},
            label = { Text(text = "Number 1")},
            placeholder ={ Text(text = "here")},
            colors = TextFieldDefaults.colors(
                cursorColor = myColor2,
                unfocusedTextColor = Color.Gray,
                focusedTextColor = myColor,
                unfocusedLabelColor = myColor7,
                focusedLabelColor = myColor3,
                focusedIndicatorColor =myColor4,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = CutCornerShape(4.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.size(5.dp))

        TextField(
            value = num2, onValueChange = {num2 = it},
            label = { Text(text = "Number2") },
            placeholder ={ Text(text = "here")},
            colors = TextFieldDefaults.colors(
                unfocusedLabelColor = myColor7,
                cursorColor = myColor7,
                focusedLabelColor = myColor3,
                focusedIndicatorColor =Color.Yellow,
                unfocusedIndicatorColor = Color.Transparent),
            shape = CutCornerShape(4.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )


        Spacer(modifier = Modifier.size(25.dp))

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                OutlinedButton(onClick = {
                    var result = num1.toInt() + num2.toInt()
                    Toast.makeText(context, "$result", Toast.LENGTH_LONG).show()
                },
                    border = BorderStroke(1.dp, myColor5),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)) {
                    Text(text = "Add",color = myColor7)

                }

                OutlinedButton(onClick = {
                    var result = num1.toInt() - num2.toInt()
                    Toast.makeText(context, "$result", Toast.LENGTH_LONG).show()
                },
                    border = BorderStroke(1.dp, myColor5),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)) {
                    Text(text = "Sub",color = myColor7 )

                }
            }
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                OutlinedButton(onClick = {
                    var result = num1.toInt() * num2.toInt()
                    Toast.makeText(context, "$result", Toast.LENGTH_LONG).show()
                },
                    border = BorderStroke(1.dp, myColor5),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)) {
                    Text(text = "Mult", color = myColor7)

                }
                OutlinedButton(onClick = {
                    var result = num1.toInt() / num2.toInt()
                    Toast.makeText(context, "$result", Toast.LENGTH_LONG).show()
                },
                    border = BorderStroke(1.dp, myColor5),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)
                ) {
                    Text(text = "div", color = myColor7)

                }
            }
        }

        
    }

}
