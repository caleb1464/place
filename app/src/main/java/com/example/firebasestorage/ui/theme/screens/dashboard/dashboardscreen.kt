package com.example.firebasestorage.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.ui.theme.red

@Composable
fun Dashboard(navController: NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
    )
    {
        //TopAppBar
        TopAppBar(title = { Text(text = "Amazon Shop") },
            backgroundColor = red
        )
        //End of TopAppBar

        Spacer(modifier = Modifier.height(30.dp))

        //Row
        Row {
            Column {
                Text(text = "Amazon",
                    fontSize = 30.sp,
                    color = red,
                    fontFamily = FontFamily.Serif
                )
                Text(text = "Shop from A to Z",
                    fontSize = 20.sp
                )
            }

            Spacer(modifier = Modifier.width(100.dp))

            Image(painter = painterResource(id = R.drawable.amazon),
                contentDescription ="Amazon",
                modifier = Modifier.size(100.dp)
            )
        }
        //End of Row

        Spacer(modifier = Modifier.height(80.dp))

        Column {
            //Row1
            Row {
                //Card1
                Card(modifier = Modifier.size(width = 150.dp, height = 120.dp)
                    .shadow(40.dp, shape = RectangleShape,clip = true, ambientColor = Color.Black, spotColor = Color.Black)
                )
                {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "Amazon",
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        Text(
                            text = "Clothing",
                            fontSize = 20.sp,
                            color = red,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                //End of Card1

                Spacer(modifier = Modifier.width(50.dp))

                //Card2
                Card(modifier = Modifier.size(width = 150.dp, height = 120.dp)
                    .shadow(40.dp, shape = RectangleShape,clip = true, ambientColor = Color.Black, spotColor = Color.Black)
                )
                {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "Amazon",
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        Text(
                            text = "Clothing",
                            fontSize = 20.sp,
                            color = red,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
                //End of Card2
            }
            //End of Row1

            Spacer(modifier = Modifier.height(40.dp))

            //Row2
            Row {
                //Card3
                Card(modifier = Modifier.size(width = 150.dp, height = 120.dp)
                    .shadow(40.dp, shape = RectangleShape,clip = true, ambientColor = Color.Black, spotColor = Color.Black)
                )
                {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "Amazon",
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        Text(
                            text = "Clothing",
                            fontSize = 20.sp,
                            color = red,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                //End of Card3

                Spacer(modifier = Modifier.width(50.dp))

                //Card4
                Card(modifier = Modifier.size(width = 150.dp, height = 120.dp)
                    .shadow(40.dp, shape = RectangleShape,clip = true, ambientColor = Color.Black, spotColor = Color.Black)
                )
                {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "Amazon",
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        Text(
                            text = "Clothing",
                            fontSize = 20.sp,
                            color = red,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
                //End of Card4
            }
            //End of Row2

            Spacer(modifier = Modifier.height(40.dp))

            //Row3
            Row {
                //Card5
                Card(modifier = Modifier.size(width = 150.dp, height = 120.dp)
                    .shadow(40.dp, shape = RectangleShape,clip = true, ambientColor = Color.Black, spotColor = Color.Black)
                )
                {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "Amazon",
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        Text(
                            text = "Clothing",
                            fontSize = 20.sp,
                            color = red,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                //End of Card5

                Spacer(modifier = Modifier.width(50.dp))

                //Card6
                Card(modifier = Modifier.size(width = 150.dp, height = 120.dp)
                    .shadow(40.dp, shape = RectangleShape,clip = true, ambientColor = Color.Black, spotColor = Color.Black)
                )
                {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "Amazon",
                                modifier = Modifier.size(50.dp)

                            )
                        }
                        Text(
                            text = "Clothing",
                            fontSize = 20.sp,
                            color = red,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
                //End of Card6
            }
            //End of Row3
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardPreview() {
    Dashboard(rememberNavController())
}