package br.senai.sp.jandira.lionschool.screens

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun TelaInicial() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(color = 0xFFFFFFFF),
                        Color(color = 0xFFFFFFFF)

                    )
                )
            ),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Row(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth()
                    .height(290.dp),

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ) {
                Image(
                    painter = painterResource(id = R.drawable.lion_logo),
                    contentDescription = stringResource(R.string.logo_description),
                    modifier = Modifier
                        .size(150.dp)

                )

                Text(
                    text = stringResource(R.string.lion_nome),
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(color = 0xFF3347B0)

                )
            }
            Column(
                modifier = Modifier
                    .padding(22.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.lion_course),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(color = 0xFF3347B0),
                    textAlign = TextAlign.Center
                )
                Card(
                    modifier = Modifier
                        .padding(5.dp)
                        .width(45.dp)
                        .height(4.dp),
                    colors = CardDefaults.cardColors
                        (containerColor = Color(color = 0xFFFFC23D))
                ) {}
                Text(
                    modifier = Modifier
                        .padding(23.dp),
                    text = stringResource(R.string.course_description),
                    fontSize = 18.sp,
                    color = Color(color = 0xFF9E9FA4),
                    textAlign = TextAlign.Center

                )
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(18.dp),
                modifier = Modifier
                    .width(300.dp)
                    .padding(
                        horizontal = 16.dp,
                        vertical = 50.dp
                    ),
                border = BorderStroke(
                    width = 2.dp,
                    color = Color(color = 0xFF3347B0)
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(color = 0xFFFFC23D)
                )
            ) {
                Text(
                    text = stringResource(R.string.get_started),
                    color = Color(color = 0xFF3347B0)

                )
            }

            Row (
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()

            ){
                Image(
                    painter = painterResource(id = R.drawable.lion_youtube),
                    contentDescription = "Y",
                    modifier = Modifier
                        .size(32.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.lion_twitter),
                    contentDescription = "T",
                    modifier = Modifier
                        .size(32.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.lion_instagram),
                    contentDescription = "I",
                    modifier = Modifier
                        .size(32.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.lion_facebook),
                    contentDescription = "F",
                    modifier = Modifier
                        .size(32.dp)
                )
            }

        }

    }


}


@Preview(showSystemUi = true)
@Composable
private fun TelaInicialPreview() {
    TelaInicial()
}