package com.example.cartao_de_visita

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.pm.ShortcutInfoCompat.Surface
import com.example.cartao_de_visita.ui.theme.Cartao_de_visitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cartao_de_visitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Dados()
                }
            }
        }
    }
}

@Composable
fun Dados() {
    Cartao(
        nome = stringResource(id = R.string.nome),
        titulo = stringResource(id = R.string.titulo),
        numero = stringResource(id = R.string.numero),
        git = stringResource(id = R.string.git),
        gmail = stringResource(id = R.string.gmail),
        imagem = painterResource(id = R.drawable.android_logo),
        icone_telefone = painterResource(id = R.drawable.call_black_24dp),
        icone_compartilhar = painterResource(id = R.drawable.share_black_24dp),
        icone_gmail = painterResource(id = R.drawable.email_black_24dp)
    )
}


@Composable
fun Cartao(
    nome: String,
    titulo: String,
    numero: String,
    git: String,
    gmail: String,
    imagem: Painter,
    icone_telefone: Painter,
    icone_compartilhar: Painter,
    icone_gmail: Painter,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = imagem,
            contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .padding(16.dp)
                .background(Color.Black)
        )
        Text(
            text = nome, fontSize = 38.sp,
            fontWeight = FontWeight.Bold

        )
        Text(
            text = titulo,

            )
    }
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.fillMaxSize()
    ) {
        Row() {
            Image(
                painter = icone_telefone,
                contentDescription = null,
                Modifier.padding(16.dp)

            )
            Text(
                text = numero,Modifier.padding(16.dp)
            )
        }
        Row() {
        Image(
            painter = icone_compartilhar,
            contentDescription = null,
            Modifier.padding(16.dp)
        )
            Text(
                text = git,Modifier.padding(16.dp)
            )
        }
        Row() {
        Image(
            painter = icone_gmail,
            contentDescription = null,
            Modifier.padding(16.dp)
        )
            Text(
                text = gmail,Modifier.padding(16.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Cartao_de_visitaTheme {
        Dados()
    }
}