package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.screens.StudentScreen

@Composable
fun Bar() {

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
        Text("SIOP", color = Color.White, fontWeight = FontWeight.SemiBold, fontSize = 17.sp)

        Box(modifier = Modifier.shadow(elevation = 5.dp, shape = RoundedCornerShape(2.dp), clip = true).clip(RoundedCornerShape(2.dp)).width(width = 200.dp)
            .height(20.dp).background(color = Color.White)){

            Box(modifier = Modifier.clip(
                RoundedCornerShape(topEnd = 3.dp, bottomEnd = 3.dp)).fillMaxHeight().width(100.dp).background(Color(0xffF6B817)))
        }

        Text("50", color = Color.White, fontWeight = FontWeight.SemiBold, fontSize = 17.sp)
    }
}


@Preview
@Composable
private fun SubjectCardPreview(){
    Bar()
}