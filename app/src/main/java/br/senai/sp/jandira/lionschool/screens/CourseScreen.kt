package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun CourseScreen(modifier: Modifier = Modifier) {
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
                .fillMaxWidth()
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 26.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lion_logo),
                    contentDescription = stringResource(R.string.logo_description),
                    modifier = Modifier
                        .size(50.dp)

                )
                Spacer(
                    modifier = Modifier
                        .width(8.dp)
                )
                Column(
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = stringResource(R.string.lion_nome),
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(color = 0xFF3347B0)

                    )
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        start = 20.dp,
                        end = 20.dp

                    ),
                color = Color(color = 0xFFFFC23D)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(stringResource(R.string.find_courses))
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color.Black
                    )
                },
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = colorResource(R.color.lion_color_yellow),
                    unfocusedContainerColor = colorResource(R.color.lion_color_light_gray)
                )
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 15.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lion_list),
                    contentDescription = "Cursos List",
                    modifier = Modifier
                        .size(
                            (30.dp)
                        )
                )
                Spacer(
                    modifier = Modifier
                        .width(5.dp)
                )
                Text(
                    text = stringResource(R.string.courses_name),
                    fontSize = 22.sp,
                    color = Color(0xFF3347B0),
                    fontWeight = FontWeight.Bold
                )
            }
            Column {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(190.dp)
                        .padding(10.dp),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color(color = 0xFFFFC23D)
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(color = 0xFF3347B0)
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 15.dp, bottom = 8.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ds_logo),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(
                                        (100.dp)
                                    ),
                            )
                            Spacer(
                                modifier = Modifier
                                    .width(10.dp)
                            )
                            Text(
                                text = stringResource(R.string.ds1),
                                fontSize = 60.sp,
                                color = Color(0xFFFFC23D),
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Text(
                            text = stringResource(R.string.ds2),
                            fontSize = 15.sp,
                            color = Color(0xFFFFFFFF),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            modifier = Modifier
                                .padding(top = 5.dp),
                            text = stringResource(R.string.ds3),
                            fontSize = 12.sp,
                            color = Color(0xFFFFFFFF),
                        )
                        Row(
                            modifier = Modifier
                                .padding(top = 15.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.watch),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(
                                        (14.dp)
                                    )
                            )
                            Spacer(
                                modifier = Modifier
                                    .width(3.dp)
                            )
                            Text(
                                text = stringResource(R.string.semestre),
                                fontSize = 10.sp,
                                color = Color(0xFFFFFFFF)
                            )
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(190.dp)
                        .padding(10.dp),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color(color = 0xFFFFC23D)
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(color = 0xFF3347B0)
                        )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 15.dp, bottom = 8.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rds_logo),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(
                                        (100.dp)
                                    )
                            )
                            Spacer(
                                modifier = Modifier
                                    .width(10.dp)
                            )
                            Text(
                                text = stringResource(R.string.rds1),
                                fontSize = 60.sp,
                                color = Color(0xFFFFC23D),
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Text(
                            text = stringResource(R.string.rds2),
                            fontSize = 15.sp,
                            color = Color(0xFFFFFFFF),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            modifier = Modifier
                                .padding(top = 5.dp),
                            text = stringResource(R.string.rds3),
                            fontSize = 12.sp,
                            color = Color(0xFFFFFFFF),

                        )

                        Row(
                            modifier = Modifier
                                .padding(top = 15.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.watch),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(
                                        (14.dp)
                                    )
                            )
                            Spacer(
                                modifier = Modifier
                                    .width(3.dp)
                            )
                            Text(
                                text = stringResource(R.string.semestre),
                                fontSize = 10.sp,
                                color = Color(0xFFFFFFFF)
                            )
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(190.dp)
                        .padding(10.dp),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color(color = 0xFFFFC23D)
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(color = 0xFF3347B0)
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 15.dp, bottom = 8.dp),
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ele_logo),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(
                                        (100.dp)
                                    )
                            )
                            Spacer(
                                modifier = Modifier
                                    .width(10.dp)
                            )
                            Text(
                                text = stringResource(R.string.ele1),
                                fontSize = 60.sp,
                                color = Color(0xFFFFC23D),
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Text(
                            text = stringResource(R.string.ele2),
                            fontSize = 15.sp,
                            color = Color(0xFFFFFFFF),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            modifier = Modifier
                                .padding(top = 5.dp),
                            text = stringResource(R.string.ele3),
                            fontSize = 12.sp,
                            color = Color(0xFFFFFFFF)
                        )
                        Row(
                            modifier = Modifier
                                .padding(top = 15.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.watch),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(
                                        (14.dp)
                                    )
                            )
                            Spacer(
                                modifier = Modifier
                                    .width(3.dp)
                            )
                            Text(
                                text = stringResource(R.string.semestre),
                                fontSize = 10.sp,
                                color = Color(0xFFFFFFFF)
                            )
                        }
                    }
                }

            }

        }

    }


}


@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    CourseScreen()
}