package edu.uksw.fti.pam.pam_activityintent.ui.screns

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun PesanScreen() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(colorResource(id = R.color.purple_200))
//            .wrapContentSize(Alignment.Center)
//    ) {
//        Text(
//            text = "Pesan Screen",
//            fontWeight = FontWeight.Bold,
//            color = Color.White,
//            modifier = Modifier.align(Alignment.CenterHorizontally),
//            textAlign = TextAlign.Center,
//            fontSize = 20.sp
//        )
//    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
    ) {
        Text(
            text = stringResource(R.string.label_activity),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.r),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .size(45.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(
                    text = "BRIVA",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 20.dp, start = 15.dp)
                )
                Text(
                    text = "PT Nusa Satu Jaya",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color(0xFF878787),
                    modifier = Modifier
                        .padding(start = 15.dp)
                )
                Text(
                    text = "DOKU - 1739256300019987",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color(0xFF878787),
                    modifier = Modifier
                        .padding(start = 15.dp)
                )
                Text(
                    text = "14 Feb 2023 19:37",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color(0xFF878787),
                    modifier = Modifier
                        .padding(top = 5.dp, start = 15.dp)
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        text = "BRIVA",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(top = 20.dp, start = 15.dp)
                    )
                    Text(
                        text = "Eben Heazer Eta",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color(0xFF878787),
                        modifier = Modifier
                            .padding(start = 15.dp)
                    )
                    Text(
                        text = "DOKU - 1833290292344777",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color(0xFF878787),
                        modifier = Modifier
                            .padding(start = 15.dp)
                    )
                    Text(
                        text = "13 Feb 2023 11:15",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color(0xFF878787),
                        modifier = Modifier
                            .padding(top = 5.dp, start = 15.dp)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "BRIVA",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = Color.Black,
                            modifier = Modifier
                                .padding(top = 20.dp, start = 15.dp)
                        )
                        Text(
                            text = "Eben Heazer Eta",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = Color(0xFF878787),
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )
                        Text(
                            text = "DOKU - 6660192639429992",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = Color(0xFF878787),
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )
                        Text(
                            text = "1 Feb 2023 00:42",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = Color(0xFF878787),
                            modifier = Modifier
                                .padding(top = 5.dp, start = 15.dp)
                        )
                    }
                }
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 155.dp, start = 20.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.emerah),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 20.dp)
                .size(45.dp)
        )
        Image(
            painter = painterResource(R.drawable.emerah),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 55.dp)
                .size(45.dp)
        )
    }
    Column(
        modifier = Modifier
            .padding(top = 135.dp, start = 290.dp, end = 20.dp)
    ) {
        Box(
            modifier = Modifier
                .width(65.dp)
                .height(18.dp)
                .fillMaxWidth()
                .background(Color.Green)
        )
    }
    Column(
        modifier = Modifier
            .padding(top = 135.dp, start = 298.dp, end = 20.dp)
    ) {
        Text(
            text = stringResource(R.string.label_success),
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier

        )
    }
    Column(
        modifier = Modifier
            .padding(top = 235.dp, start = 290.dp, end = 20.dp)
    ) {
        Box(
            modifier = Modifier
                .width(65.dp)
                .height(18.dp)
                .fillMaxWidth()
                .background(Color.Green)
        )
    }
    Column(
        modifier = Modifier
            .padding(top = 235.dp, start = 298.dp, end = 20.dp)
    ) {
        Text(
            text = stringResource(R.string.label_success),
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier
        )
    }
    Column(
        modifier = Modifier
            .padding(top = 340.dp, start = 290.dp, end = 20.dp)
    ) {
        Box(
            modifier = Modifier
                .width(65.dp)
                .height(18.dp)
                .fillMaxWidth()
                .background(Color.Green)
        )
    }
    Column(
        modifier = Modifier
            .padding(top = 340.dp, start = 298.dp, end = 20.dp)
    ) {
        Text(
            text = stringResource(R.string.label_success),
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier
        )
    }
}
@Preview(showBackground = true)
@Composable
fun Pesan() {
    PAM_ActivityIntentTheme {
        PesanScreen()
    }
}