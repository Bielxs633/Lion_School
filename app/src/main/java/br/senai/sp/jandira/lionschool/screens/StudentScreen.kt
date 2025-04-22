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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
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

@Composable

fun StudentScreen(modifier: Modifier = Modifier) {

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
                        fontSize = 20.sp,
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
                    Text(stringResource(R.string.find_student))
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color.Black
                    )
                },
                modifier = Modifier
                    .padding(top = 10.dp)
                    .padding(start = 15.dp, end = 15.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = colorResource(R.color.lion_color_yellow),
                    unfocusedContainerColor = colorResource(R.color.lion_color_light_gray)
                )
            )
        }
        Row(

        ){
            Button(
                onClick = {},
                shape = RoundedCornerShape(18.dp),
                modifier = Modifier
                    .width(130.dp)
                    .padding(
                        vertical = 200.dp
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(color = 0xFFFFC23D)
                )
            ) {
                Text(
                    text = stringResource(R.string.all),
                    color = Color(color = 0xFF3347B0),
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(18.dp),
                modifier = Modifier
                    .width(130.dp)
                    .padding(
                        vertical = 200.dp
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(color = 0xFFFFC23D)
                )
            ) {
                Text(
                    text = stringResource(R.string.studying),
                    color = Color(color = 0xFF3347B0),
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center

                )
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(18.dp),
                modifier = Modifier
                    .width(130.dp)
                    .padding(
                        vertical = 200.dp
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(color = 0xFFFFC23D)
                )
            ) {
                Text(
                    text = stringResource(R.string.finished),
                    color = Color(color = 0xFF3347B0),
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(
//                brush = Brush.linearGradient(
//                    listOf(
//                        Color(color = 0xFFFFFFFF),
//                        Color(color = 0xFFFFFFFF)
//
//                    )
//                )
//            ),
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .fillMaxSize()
//                .padding(horizontal = 16.dp, vertical = 16.dp)
//        ) {
//            Row(
//                modifier = Modifier
//                    .padding(top = 26.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
//
//            ) {
//                Row(
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.lion_logo),
//                        contentDescription = stringResource(R.string.logo_description),
//                        modifier = Modifier
//                            .size(50.dp)
//                    )
//                }
//
//                Spacer(
//                    modifier = Modifier
//                        .width(8.dp)
//                )
//
//                Column(
//                    modifier = Modifier
//                        .weight(1f),
//                    horizontalAlignment = AbsoluteAlignment.Right
//
//                ) {
//                    Text(
//                        text = stringResource(R.string.lion_nome),
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color(color = 0xFF3347B0)
//
//                    )
//
//                }
//
//            }
//
//            Card (
//                modifier = Modifier
//                    .size(100.dp),
//                shape = CircleShape,
//                border = BorderStroke(
//                    width = 0.dp,
//                    color = Color(0xFFFFFFFF)
//                )
//            ) {
//            }
//        }
//
//
//        Column(
//            horizontalAlignment = Alignment.Start
//        ) {
//            Text(
//                text = stringResource(R.string.lion_nome),
//                fontSize = 20.sp,
//                fontWeight = FontWeight.Bold,
//                color = Color(color = 0xFF3347B0)
//
//            )
//        }
//    }
//    HorizontalDivider(
//        modifier = Modifier
//            .padding(
//                top = 10.dp,
//                start = 20.dp,
//                end = 20.dp
//
//            ),
//        color = Color(color = 0xFFFFC23D)
//    )
//    OutlinedTextField(
//        value = "",
//        onValueChange = {},
//        label = {
//            Text(stringResource(R.string.find_student))
//        },
//        trailingIcon = {
//            Icon(
//                imageVector = Icons.Default.Search,
//                contentDescription = null,
//                tint = Color.Black
//            )
//        },
//        modifier = Modifier
//            .padding(15.dp)
//            .fillMaxWidth(),
//        shape = RoundedCornerShape(10.dp)
//    )


@Preview(showSystemUi = true)
@Composable
private fun StudentScreenPreview() {
    StudentScreen()
}