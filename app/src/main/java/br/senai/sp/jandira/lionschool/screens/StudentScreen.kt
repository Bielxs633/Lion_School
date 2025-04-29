package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.LionStudentComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudentScreen(){
    Box(){
        Column(modifier = Modifier.padding(vertical = 10.dp).padding(horizontal = 15.dp)) {


            Row( // 'header'
                modifier = Modifier.padding()
            ){
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween){
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
                        Box(
                            modifier = Modifier.size(60.dp).clip(shape = CircleShape).background(
                                colorResource(R.color.lion_color_yellow)
                            )
                        ){
                            Text(
                                text = stringResource(R.string.ds1),
                                modifier = Modifier
                                    .align(alignment = Alignment.Center),
                                fontSize = 26.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = colorResource(R.color.lion_color_blue)
                            )
                        }
                    }

                    HorizontalDivider(
                        color = colorResource(R.color.lion_color_yellow),
                        modifier = Modifier.padding(horizontal = 6.5.dp).padding(top = 10.dp)
                    )
                }
            }

            OutlinedTextField(
                value = "",
                onValueChange = {},
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFFCCA04A),
                    unfocusedBorderColor = colorResource(R.color.lion_color_yellow),
                    unfocusedLabelColor = Color(0xFF8F8F8F),
                    focusedLabelColor = Color(0xFF383838),
                    containerColor = Color(0xFFF5F5F5)
                ),
                label = {
                    Text(text = stringResource(R.string.find_student), modifier = Modifier.padding(horizontal = 20.dp))
                },
                trailingIcon = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "Pesquisar", tint = Color(0xFF8F8F8F))
                },
                modifier = Modifier.padding(top = 20.dp).fillMaxWidth().height(50.dp)
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(top = 20.dp)
            ){
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(colorResource(R.color.lion_color_yellow))
                ) {
                    Text(
                        text = stringResource(R.string.all),
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(colorResource(R.color.lion_color_blue))
                ) {
                    Text(
                        text = stringResource(R.string.courses_name),
                        modifier = Modifier.padding(horizontal = 2.dp).align(Alignment.CenterVertically)
                    )
                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(colorResource(R.color.lion_color_blue))
                ) {
                    Text(
                        text = stringResource(R.string.finished),
                        modifier = Modifier.padding(horizontal = 2.dp).align(Alignment.CenterVertically)
                    )

                }

            }

            Column(
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(R.drawable.lion_graduation),
                        contentDescription = "",
                        modifier = Modifier.size(30.dp)
                    )
                    Text(
                        text = stringResource(R.string.student_list),
                        color = colorResource(R.color.lion_color_blue),
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 5.dp)
                    )
                }
                Column(){
                    LionStudentComponent()
                    LionStudentComponent()
                    LionStudentComponent()
                    LionStudentComponent()
                    LionStudentComponent()
                    LionStudentComponent()
                    LionStudentComponent()
                }
            }


        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun InitialScreenPreview () {
    StudentScreen()
}