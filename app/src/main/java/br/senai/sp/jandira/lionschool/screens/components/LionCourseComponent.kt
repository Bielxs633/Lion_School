package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R


@Composable
fun LionCourseComponent(
    imageLogo: Painter = painterResource(id = R.drawable.ds_logo),
    textIcon: String = "",
    textTitle: String = "",
    textDescription: String = "",
    textSemester: String = "",
    isFilled: Boolean = false
){
    Card(
        modifier = Modifier
            .width(322.dp)
            .height(190.dp),
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(1.dp, colorResource(R.color.lion_color_yellow))
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            colorResource(R.color.lion_color_blue),
                            colorResource(R.color.lion_color_light_white)
                        )
                    )
                )
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(18.dp),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = if(isFilled) imageLogo else painterResource(id = R.drawable.ds_logo),
                        contentDescription = "",
                        modifier = Modifier
                            .height(102.dp)
                            .width(101.dp)
                    )
                    Text(
                        text = textIcon,
                        fontSize = 64.sp,
                        color = colorResource(R.color.lion_color_yellow),
                        fontWeight = FontWeight.ExtraBold
                    )
                }
                Column() {
                    Text(
                        text = textTitle,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = textDescription,
                        color = Color.White,
                        fontWeight = FontWeight.Thin
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.watch),
                        contentDescription = "",
                        modifier = Modifier
                            .width(15.dp)
                            .height(15.dp)
                    )
                    Text(
                        text = textSemester,
                        color = Color.White,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun LionCourseComponentPreview(){
    LionCourseComponent()
}