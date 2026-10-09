package com.example.tugaspraktikum_p4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

@Composable
fun LayoutUtama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = dimensionResource(R.dimen.margin_layar)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.jarak_atas_header)))
        Text(
            text = stringResource(R.string.judul_jurusan),
            color = colorResource(R.color.teks_judul),
            fontSize = spResource(R.dimen.ukuran_judul),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.judul_kampus),
            color = colorResource(R.color.teks_judul),
            fontSize = spResource(R.dimen.ukuran_subjudul),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.jarak_judul_ke_kartu)))


    }
}