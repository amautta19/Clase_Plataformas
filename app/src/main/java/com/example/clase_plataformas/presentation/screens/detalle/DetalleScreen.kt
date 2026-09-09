package com.example.clase_plataformas.presentation.screens.detalle

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Label
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clase_plataformas.R
import com.example.clase_plataformas.presentation.common.CuadroInfo
import com.example.clase_plataformas.presentation.common.InfoCard
import com.example.clase_plataformas.presentation.common.MetaBadge

@Composable
fun DetalleScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD4D4EE))
            .padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.size(width = 180.dp, height = 240.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            shape = RoundedCornerShape(size = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.libro),
                contentDescription = "Imagen de libro",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        CuadroInfo(icono = Icons.Default.Book, texto = "COLECCIÓN CLÁSICA")
        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Cien Años de Soledad",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            color = Color(0xFF101140)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Outlined.Edit,
                "Icono_nonmbres",
                tint = Color(0xFF3823A8),
                modifier = Modifier.size(14.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "Gabriel García Márquez",
                fontSize = 14.sp,
                color = Color(0xFF555B6E),
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // 2 Tarjetas
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp) // Espacio entre cada elemento del ROW
        ) {
            InfoCard(
                icon = Icons.Outlined.DateRange,
                label = "Publicación",
                value = "1967",
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                icon = Icons.AutoMirrored.Outlined.Label,
                label = "Género",
                value = "Realismo M...",
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Barra de Disponibilidad
        Surface(
            shape = RoundedCornerShape(12.dp),
            color = Color(0xFFF3F2FE),
            border = BorderStroke(1.dp, Color(0xFFE2E0FD)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .background(Color(0xFF00A86B), CircleShape)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Disponibilidad en biblioteca",
                        fontSize = 11.sp,
                        color = Color(0xFF555B6E)
                    )
                }
                Text(
                    text = "Copia Física • Estante 4B",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF261C80)
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        val primaryNavy = Color(0xFF101140)

        // Sección Descripción / Sinopsis
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            border = BorderStroke(1.dp, Color(0xFFEAEAF5)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                // Header Descripción
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Outlined.Menu,
                            contentDescription = null,
                            tint = primaryNavy,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Descripción",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = primaryNavy
                        )
                    }
                    Text(
                        text = "SINOPSIS OFICIAL",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF7D7F99)
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Texto Justificado/Largo
                Text(
                    text = "La monumental obra de Gabriel García Márquez narra las siete generaciones de la estirpe Buendía en la mítica aldea de Macondo. Con una maestría estilística inigualable, la novela entrelaza lo fantástico con la realidad sociopolítica de América Latina, explorando la soledad, el destino circular y los amores prohibidos que marcan para siempre la memoria cultural hispanoamericana.",
                    fontSize = 12.sp,
                    color = Color(0xFF555B6E),
                    lineHeight = 18.sp,
                    textAlign = TextAlign.Justify
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Metadata Chips
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    MetaBadge(text = "ISBN: 978-0307474728")
                    MetaBadge(text = "496 Páginas")
                }
                Spacer(modifier = Modifier.height(6.dp))
                MetaBadge(text = "Idioma: Español")
            }
        }
    }
}