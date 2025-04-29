package br.senai.sp.jandira.lionschool.screens

import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.Bar

@Composable
fun DetailScreen(){

    Box(
        modifier = Modifier.fillMaxSize().background(color = Color.White)
    ){
        Column(modifier = Modifier.padding(vertical = 10.dp).padding(horizontal = 15.dp)) {

            Row( // 'header'
                modifier = Modifier.padding()
            ){
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Image(
                                painter = painterResource(R.drawable.lion_logo),
                                contentDescription = "",
                                modifier = Modifier.size(60.dp)
                            )
                            Text(
                                text = stringResource(R.string.lion_nome),
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(color = 0xFF3347B0)
                            )
                        }
                    }

                    HorizontalDivider(
                        color = colorResource(R.color.lion_color_yellow),
                        modifier = Modifier.padding(horizontal = 6.5.dp).padding(top = 10.dp)
                    )
                }
            }

            Column(modifier = Modifier.align(
                Alignment.CenterHorizontally).width(280.dp).padding(top = 45.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(R.drawable.user), contentDescription = "",
                    modifier = Modifier.size(140.dp).clip(shape = CircleShape).border(width = 3.5.dp, color = colorResource(R.color.lion_color_yellow), shape = CircleShape))
                Text("Luana Oliveira Dias", color = colorResource(R.color.lion_color_blue), textAlign = TextAlign.Center, fontSize = 30.sp, fontWeight = FontWeight.W500)
                Text("001 - Técnico em Desenvolvimento de Sistemas", color = colorResource(R.color.lion_color_blue), textAlign = TextAlign.Center, fontWeight = FontWeight.W500, fontSize = 14.sp)
            }

            Card(modifier = Modifier.fillMaxSize().padding(top = 40.dp, bottom = 5.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xff9FA9E1))) {

                Column(modifier = Modifier.fillMaxSize().padding(top = 20.dp), horizontalAlignment = Alignment.CenterHorizontally){

                    Text(text = stringResource(R.string.performance), color = Color.White, fontSize = 23.sp)

                    Column(Modifier.fillMaxWidth().height(350.dp).padding(horizontal = 30.dp, vertical = 55.dp), verticalArrangement = Arrangement.SpaceBetween){
                        Bar()
                        Bar()
                        Bar()
                        Bar()
                        Bar()
                        Bar()
                    }

                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.align(alignment = Alignment.End).padding(end = 20.dp)) {
                        Icon(imageVector = Icons.Default.CheckCircle, tint = Color(0xff76f94c), contentDescription = "")
                        Text(text = stringResource(R.string.completed), color = Color(0xff3347B0), fontWeight = FontWeight.SemiBold, fontSize = 23.sp, modifier = Modifier.padding(start = 5.dp))
                    }
                }

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun DetailScreenPreview () {
    DetailScreen()
}