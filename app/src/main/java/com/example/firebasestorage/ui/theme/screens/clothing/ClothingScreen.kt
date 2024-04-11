package com.example.firebasestorage.ui.theme.screens.clothing

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R


@Composable
fun ClothingScreen(navController:NavHostController) {
   Column (
      modifier = Modifier
         .fillMaxSize()
   )
   {

      val mContext = LocalContext.current

      TopAppBar(title = { Text(text = "Shop For Clothing") },
         actions = {
            Icon(
               imageVector = Icons.Default.Menu,
               contentDescription = "Menu",
               Modifier.size(40.dp))

            Spacer(modifier = Modifier.width(20.dp))
         }
      )

      Spacer(modifier = Modifier.height(20.dp))

      Column (modifier = Modifier
         .fillMaxSize()
         .verticalScroll(rememberScrollState())
      )
      {
         Row(
            modifier = Modifier
               .fillMaxWidth()
               .horizontalScroll(rememberScrollState())
         )
         {
            Column(modifier = Modifier.padding(start = 10.dp))
            {
               Text(
                  text = "Featured",
                  color = Color.Black,
                  fontSize = 30.sp,
                  fontWeight = FontWeight.Bold
               )
            }

            Column(modifier = Modifier.padding(start = 20.dp))
            {
               Text(
                  text = "New",
                  color = Color.Gray,
                  fontSize = 30.sp,
                  fontWeight = FontWeight.Bold,
                  modifier = Modifier.clickable {
                  }
               )
            }

            Column(modifier = Modifier.padding(start = 20.dp))
            {
               Text(
                  text = "Collection",
                  color = Color.Gray,
                  fontSize = 30.sp,
                  fontWeight = FontWeight.Bold
               )
            }

            Column(modifier = Modifier.padding(start = 20.dp))
            {
               Text(
                  text = "Trending",
                  color = Color.Gray,
                  fontSize = 30.sp,
                  fontWeight = FontWeight.Bold
               )
            }
         }
         /* End Scrollable Row */

         Spacer(modifier = Modifier.height(20.dp))

         Row(modifier = Modifier.fillMaxWidth())
         {
            Card(
               modifier = Modifier
                  .fillMaxWidth()
                  .height(260.dp)
                  .padding(start = 20.dp, end = 20.dp)
                  .shadow(10.dp, RoundedCornerShape(10.dp)
                  )
            )
            {
               Row {
                  Column(
                     modifier = Modifier
                        .fillMaxSize(0.5F)
                        .padding(start = 20.dp)
                  )
                  {

                     Spacer(modifier = Modifier.height(50.dp))

                     Text(
                        text = "Classic",
                        color = Color.Gray,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                     )
                     Text(
                        text = "Classic appearance",
                        color = Color.Black,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium
                     )
                     Text(
                        text = "With a blend of color",
                        color = Color.Black,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium
                     )
                  }
                  Column(modifier = Modifier.fillMaxSize())
                  {
                     Image(
                        painter = painterResource(id = R.drawable.clothing1),
                        contentDescription = "img",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                     )
                  }
               }
            }
         }//End of Main Row

         Spacer(modifier = Modifier.height(20.dp))

         //cards columns start
         Column(modifier = Modifier.padding(start = 40.dp))
         {
            Row {
               //First Card
               Card (modifier = Modifier
                  .size(width = 150.dp, height = 300.dp)
                  .shadow(30.dp)
               )
               {
                  Box(
                     modifier = Modifier.fillMaxWidth(),
                     contentAlignment = Alignment.Center
                  )
                  {
                     Image(
                        painter = painterResource(id = R.drawable.menclothing),
                        contentDescription = "amazon",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop,
                        )

                     Column(
                        modifier = Modifier
                           .align(Alignment.BottomStart)
                           .background(Color.White)
                           .fillMaxWidth()
                     )
                     {
                        Text(
                           text = "Men Tuxedo",
                           fontSize = 20.sp,
                        )
                        Text(
                           text = "Ksh. 900",
                           fontSize = 20.sp,
                        )

                        OutlinedButton(
                           onClick = { val simToolKitLaunchIntent =
                              mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                              simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                     },
                           modifier = Modifier.fillMaxWidth()
                        )
                        {
                           Text(
                              text = "Add to Cart",
                              fontSize = 30.sp
                           )
                        }
                     }
                  }
               }
               //End of First Card

               Spacer(modifier = Modifier.width(30.dp))

               //Second Card
               Card (modifier = Modifier
                  .size(width = 150.dp, height = 300.dp)
                  .shadow(30.dp)
               )
               {
                  Box(
                     modifier = Modifier.fillMaxWidth(),
                     contentAlignment = Alignment.Center
                  )
                  {
                     Image(
                        painter = painterResource(id = R.drawable.womenclothing),
                        contentDescription = "amazon",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop,
                        )

                     Column(
                        modifier = Modifier
                           .align(Alignment.BottomStart)
                           .background(Color.White)
                           .fillMaxWidth()
                     ) {
                        Text(
                           text = "Fur Coats",
                           fontSize = 20.sp,
                        )
                        Text(
                           text = "Ksh. 2500",
                           fontSize = 20.sp,
                        )

                        OutlinedButton(
                           onClick = { val simToolKitLaunchIntent =
                              mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                              simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                     },
                           modifier = Modifier
                              .fillMaxWidth()
                              .clip(RoundedCornerShape(10.dp)
                              ),
                           )
                        {
                           Text(
                              text = "Add to Cart",
                              fontSize = 30.sp
                           )
                        }
                     }
                  }
               }
               //End of Second Card
            } // End of Row 1
            
            Spacer(modifier = Modifier.height(30.dp))

            //Row 2
            Row {
               //Third Card
               Card (modifier = Modifier
                  .size(width = 150.dp, height = 300.dp)
                  .shadow(30.dp)
               )
               {
                  Box(
                     modifier = Modifier.fillMaxWidth(),
                     contentAlignment = Alignment.Center
                  )
                  {
                     Image(
                        painter = painterResource(id = R.drawable.whitesuits),
                        contentDescription = "amazon",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop,
                        )

                     Column(
                        modifier = Modifier
                           .align(Alignment.BottomStart)
                           .background(Color.White)
                           .fillMaxWidth()
                     )
                     {
                        Text(
                           text = "White suits",
                           fontSize = 20.sp
                        )
                        Text(
                           text = "Ksh. 1500",
                           fontSize = 20.sp
                        )

                        OutlinedButton(
                           onClick = { val simToolKitLaunchIntent =
                              mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                              simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                     },
                           modifier = Modifier.fillMaxWidth()
                        )
                        {
                           Text(
                              text = "Add to Cart",
                              fontSize = 30.sp
                           )
                        }
                     }
                  }
               }
               //End of Third Card

               Spacer(modifier = Modifier.width(30.dp))

               //Fourth card
               Card (modifier = Modifier
                  .size(width = 150.dp, height = 300.dp)
                  .shadow(30.dp)
               )
               {
                  Box(
                     modifier = Modifier.fillMaxWidth(),
                     contentAlignment = Alignment.Center
                  )
                  {
                     Image(
                        painter = painterResource(id = R.drawable.gucci),
                        contentDescription = "amazon",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                        )

                     Column(
                        modifier = Modifier
                           .align(Alignment.BottomStart)
                           .background(Color.White)
                           .fillMaxWidth()
                     )
                     {
                        Text(
                           text = "Gucci Fashion Clothes",
                           fontSize = 20.sp,
                        )
                        Text(
                           text = "Ksh. 2500",
                           fontSize = 20.sp
                        )

                        OutlinedButton(
                           onClick = { val simToolKitLaunchIntent =
                              mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                              simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                     },
                           modifier = Modifier
                              .fillMaxWidth()
                              .clip(RoundedCornerShape(30.dp)
                              ),
                           )
                        {
                           Text(
                              text = "Add to Cart",
                              fontSize = 30.sp
                           )
                        }
                     }
                  }
               }
               //End of Fourth Card
            } // End of Row 2

            Spacer(modifier = Modifier.height(30.dp))

            //Row 3
            Row {

               //Fifth Card
               Card (modifier = Modifier
                  .size(width = 150.dp, height = 300.dp)
                  .shadow(30.dp)
               )
               {
                  Box(
                     modifier = Modifier.fillMaxWidth(),
                     contentAlignment = Alignment.Center
                  )
                  {
                     Image(
                        painter = painterResource(id = R.drawable.children),
                        contentDescription = "amazon",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                     )

                     Column(
                        modifier = Modifier
                           .align(Alignment.BottomStart)
                           .background(Color.White)
                           .fillMaxWidth()
                     )
                     {
                        Text(
                           text = "Children Fashion",
                           fontSize = 20.sp,
                        )
                        Text(
                           text = "Ksh. 2500",
                           fontSize = 20.sp
                        )

                        OutlinedButton(
                           onClick = { val simToolKitLaunchIntent =
                              mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                              simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                     },
                           modifier = Modifier
                              .fillMaxWidth()
                              .clip(RoundedCornerShape(30.dp)
                              ),
                           )
                        {
                           Text(
                              text = "Add to Cart",
                              fontSize = 30.sp
                           )
                        }
                     }
                  }
               }

               Spacer(modifier = Modifier.width(30.dp))

               //Sixth card
               Card (modifier = Modifier
                  .size(width = 150.dp, height = 300.dp)
                  .shadow(30.dp)
               )
               {
                  Box(
                     modifier = Modifier.fillMaxWidth(),
                     contentAlignment = Alignment.Center
                  )
                  {
                     Image(
                        painter = painterResource(id = R.drawable.ladies),
                        contentDescription = "amazon",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop,
                     )

                     Column(
                        modifier = Modifier
                           .align(Alignment.BottomStart)
                           .background(Color.White)
                           .fillMaxWidth()
                     )
                     {
                        Text(
                           text = "Ladies Dress",
                           fontSize = 20.sp,
                        )
                        Text(
                           text = "Ksh. 2500",
                           fontSize = 20.sp
                        )

                        OutlinedButton(
                           onClick = {  val simToolKitLaunchIntent =
                              mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                              simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                     },
                           modifier = Modifier.fillMaxWidth()
                              .clip(RoundedCornerShape(30.dp)),
                           )
                        {
                           Text(
                              text = "Add to Cart",
                              fontSize = 30.sp
                           )
                        }
                     }
                  }
               }
               //End of Sixth Card
            } // End of Row 3
         }
      }
   }
}

@Preview(showBackground = true)
@Composable
fun ClothingScreenPreview() {
   ClothingScreen(rememberNavController())
}