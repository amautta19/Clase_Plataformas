package com.example.clase_plataformas.presentation.screens.examen_molina

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Terminal
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clase_plataformas.R

@Composable
fun CVScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDBDBE8))
            .padding(all = 20.dp).verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.size(width = 180.dp, height = 150.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            shape = RoundedCornerShape(size = 20.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.logo_personal),
                contentDescription = "Imagen de libro",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
        Spacer(modifier = Modifier.height(15.dp))

        Text(
            "Alvaro Molina",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A1A40)
        )
        Text(
            "Ingeniero de Sistemas",
            fontSize = 14.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFFF0F0F5), shape = RoundedCornerShape(10.dp))
                .padding(horizontal = 12.dp, vertical = 6.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(color = Color(0xFF2ECC71), shape = CircleShape)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = "Full-time")

            Spacer(modifier = Modifier.width(40.dp))
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(color = Color(0xFF2ECC71), shape = CircleShape)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = "Lima, Perú")
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A1A40))
            ) {
                Text(text = "Descargar CV")
            }

            Spacer(modifier = Modifier.width(10.dp))

            OutlinedButton(
                onClick = { }
            ) {
                Text(text = "Contactar")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Perfil Profesional",
                fontSize = 18.dp.value.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A1A40)
            )
            Text(
                text = "RESUMEN",
                fontSize = 12.sp,
                color = Color(0xFF4A6FA5)
            )
        }
        Spacer(modifier = Modifier.height(25.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            shape = RoundedCornerShape(size = 12.dp)
        ) {
            Text(
                text = "Ingeniero de Sistema con solida experiencia liderenado la arquitecto e ingenieria de plataforma.....Ingeniero de Sistema con solida experiencia liderenado la arquitecto e ingenieria de plataforma.....Ingeniero de Sistema con solida experiencia liderenado la arquitecto e ingenieria de plataforma.....",
                fontSize = 14.sp,
                color = Color.DarkGray,
                modifier = Modifier.padding(16.dp)
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CuadroIndicadores(numero = "8+", texto = "Años de Exp")
            CuadroIndicadores(numero = "25+", texto = "Proyectos")
            CuadroIndicadores(numero = "99.9%", texto = "Disponibilidad")
        }
        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Habilidades Técnicas",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A1A40),
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(10.dp))
        Divider(color = Color.LightGray)
        Spacer(modifier = Modifier.height(15.dp))
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            shape = RoundedCornerShape(size = 12.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Terminal,
                        contentDescription = null,
                        tint = Color(0xFF1A1A40)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Lenguajes & Datos",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A1A40)
                    )
                }

                Spacer(modifier = Modifier.height(15.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    CuadroLenguajes(lenguaje = "Kotlin")
                    CuadroLenguajes(lenguaje = "Python")
                    CuadroLenguajes(lenguaje = "TypeScript")
                }
                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    CuadroLenguajes(lenguaje = "AWS")
                    CuadroLenguajes(lenguaje = "Java")
                    CuadroLenguajes(lenguaje = "C#")
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

    }
}