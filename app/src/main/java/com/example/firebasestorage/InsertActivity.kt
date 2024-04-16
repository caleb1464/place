package com.example.firebasestorage

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firebasestorage.ui.theme.red
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore

class InsertActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            firebaseUI()

        }
    }
}


@SuppressLint("ComposableNaming")
@Composable
fun firebaseUI() {
    val context= LocalContext.current
    val courseName = remember { mutableStateOf("") }
    val courseDuration = remember { mutableStateOf("") }
    val courseDescription = remember { mutableStateOf("") }


    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Add Course",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive
        )

        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.amazon),
            contentDescription = "course",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = courseName.value,
            onValueChange = { courseName.value = it },
            placeholder = { Text(text = "Enter your course name") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(
            value = courseDuration.value,
            onValueChange = { courseDuration.value = it },
            placeholder = { Text(text = "Enter your course duration") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(
            value = courseDescription.value,
            onValueChange = { courseDescription.value = it },
            placeholder = { Text(text = "Enter your course description") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
                if (TextUtils.isEmpty(courseName.value)) {
                    Toast.makeText(context, "Please enter course name", Toast.LENGTH_SHORT)
                        .show()
                } else if (TextUtils.isEmpty(courseDuration.value)) {
                    Toast.makeText(context, "Please enter course Duration", Toast.LENGTH_SHORT)
                        .show()
                } else if (TextUtils.isEmpty(courseDescription.value)) {
                    Toast.makeText(
                        context,
                        "Please enter course descritpion",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                } else {
                    addDataToFirebase(
                        courseName.value, courseDuration.value, courseDescription.value, context
                    )
                }
            },

            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = ButtonDefaults.buttonColors(red),
            shape = RoundedCornerShape(5.dp)
        ) {

            Text(text = "Add Data", modifier = Modifier.padding(8.dp))
        }

        Spacer(modifier = Modifier.height(5.dp))


        Text(
            text = "View Courses",
            color = red,
            modifier = Modifier
                .clickable {
                    context.startActivity(Intent(context, DetailsActivity::class.java))
                }
                .padding(8.dp))
    }

}



fun addDataToFirebase(courseName: String, courseDuration: String, courseDescription: String,
                      context: Context
) {
    val db: FirebaseFirestore = FirebaseFirestore.getInstance()
    val dbCourses: CollectionReference = db.collection("Courses")
    val courses = Course(courseName, courseDescription, courseDuration)
    dbCourses.add(courses).addOnSuccessListener {
        Toast.makeText(context, "Your Course has been added to Firebase Firestore", Toast.LENGTH_SHORT).show()

    }.addOnFailureListener {
        Toast.makeText(context, "Fail to add course", Toast.LENGTH_SHORT).show()
    }

}

@Preview(showBackground = true)
@Composable
fun FirebaseUiPreview() {
    firebaseUI()
}
