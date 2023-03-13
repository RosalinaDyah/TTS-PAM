package edu.uksw.fti.pam.pam_activityintent.ui.screns

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun Lainnya() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
//            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = stringResource(R.string.label_fav),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 70.dp, start = 30.dp, end = 30.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.transfer),
            contentDescription = "transfer",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.briva),
            contentDescription = "briva",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.listrik),
            contentDescription = "listrik",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.pulsa),
            contentDescription = "pulsa",
            modifier = Modifier
                .size(50.dp)
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 160.dp, start = 30.dp, end = 115.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.briva),
            contentDescription = "brizzi",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.tariktunai),
            contentDescription = "trktunai",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.wallet),
            contentDescription = "dompet",
            modifier = Modifier
                .size(50.dp)
        )

    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 125.dp, start = 30.dp, end = 40.dp)
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_qr),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_deposit),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_tarik),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_transfer),
            fontSize = 12.sp,
            color = Color.Black,
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 215.dp, start = 30.dp, end = 108.dp)
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_brizzi),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_tarik),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_dompet),
            fontSize = 12.sp,
            color = Color.Black,
        )
    }

    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 250.dp, start = 20.dp, end = 20.dp)
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_transfercash),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 300.dp, start = 30.dp, end = 30.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.tariktunai),
            contentDescription = "mutasi",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.keuangan),
            contentDescription = "keuangan",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.mutasi),
            contentDescription = "mutasi",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.transfer),
            contentDescription = "keuangan",
            modifier = Modifier
                .size(50.dp)
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 355.dp, start = 30.dp, end = 40.dp)
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_qr),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_deposit),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_tarik),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_transfer),
            fontSize = 12.sp,
            color = Color.Black,
        )

    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 390.dp, start = 35.dp, end = 215.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.listrik),
            contentDescription = "mutasi",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.wallet),
            contentDescription = "keuangan",
            modifier = Modifier
                .size(50.dp)
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 450.dp, start = 25.dp, end = 200.dp)
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_instalment),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_confirmation),
            fontSize = 12.sp,
            color = Color.Black,
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 485.dp, start = 20.dp, end = 20.dp)
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_financial_statements),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 535.dp, start = 35.dp, end = 215.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.mutasi),
            contentDescription = "mutasi",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.keuangan),
            contentDescription = "keuangan",
            modifier = Modifier
                .size(50.dp)
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 595.dp, start = 35.dp, end = 190.dp)
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_mutation),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_financial),
            fontSize = 12.sp,
            color = Color.Black,
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 635.dp, start = 20.dp, end = 20.dp)
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_bill),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
    }
//    Row(
////        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(top = 680.dp, start = 35.dp, end = 30.dp)
//    ) {
//        Image(
//            painter = painterResource(R.drawable.briva),
//            contentDescription = "mutasi",
//            modifier = Modifier
//                .size(50.dp)
//        )
//        Image(
//            painter = painterResource(R.drawable.mutasi),
//            contentDescription = "keuangan",
//            modifier = Modifier
//                .size(50.dp)
//        )
//        Image(
//            painter = painterResource(R.drawable.tariktunai),
//            contentDescription = "mutasi",
//            modifier = Modifier
//                .size(50.dp)
//        )
//        Image(
//            painter = painterResource(R.drawable.keuangan),
//            contentDescription = "keuangan",
//            modifier = Modifier
//                .size(50.dp)
//        )
//    }
//    Row(
////        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(top = 735.dp, start = 30.dp, end = 40.dp)
//    ) {
//        Text(
//            textAlign = TextAlign.Center,
//            text = stringResource(R.string.label_instalment),
//            fontSize = 12.sp,
//            color = Color.Black,
//        )
//        Text(
//            textAlign = TextAlign.Center,
//            text = stringResource(R.string.label_education),
//            fontSize = 12.sp,
//            color = Color.Black,
//        )
//        Text(
//            textAlign = TextAlign.Center,
//            text = stringResource(R.string.label_telkom),
//            fontSize = 12.sp,
//            color = Color.Black,
//        )
//        Text(
//            textAlign = TextAlign.Center,
//            text = stringResource(R.string.label_investasi),
//            fontSize = 12.sp,
//            color = Color.Black,
//        )
//
//    }
}

@Preview(showBackground = true)
@Composable
fun LainnyaPreview() {
    PAM_ActivityIntentTheme {
        Lainnya()
    }
}