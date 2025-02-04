package com.example.assignment2_q1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignment2_q1.ui.theme.Assignment2_Q1Theme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assignment2_Q1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    padding ->
                    Recipe(modifier = Modifier.padding(padding))
                }
            }
        }
    }
}

// Recipe Title
@Composable
fun Recipe(modifier: Modifier = Modifier) {
    Column {
        //    Recipe Title
        Row (modifier = Modifier.padding(start = 90.dp, top = 15.dp)) {
            OutlinedCard(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer),
                border = BorderStroke(1.dp, Color.Black),
                modifier = Modifier.size(width = 230.dp, height = 60.dp))
            {
                Box (contentAlignment = Alignment.Center, modifier = modifier.fillMaxSize())
                {
                    Text(text = "Oyakodon Recipe", textAlign = TextAlign.Center, fontSize = 23.sp)
                }

            }
        }
//        Ingredients
//        Header
        Row (modifier = Modifier.height(IntrinsicSize.Min).padding(start = 80.dp)) {
            Image(painter = painterResource(id = R.drawable.oyakodon),
                contentDescription = "image of oyakodon",
                modifier = Modifier.size(130.dp))
            VerticalDivider(modifier = modifier.padding(25.dp))
            Column (modifier = modifier.padding(top = 20.dp)){
                Image(painter = painterResource(id = R.drawable.oyakodon_icon),
                    contentDescription = "icon of oyakodon",
                    modifier = Modifier.size(70.dp)
                )
                Text(text = "Yields 4 servings", fontSize = 8.sp)
            }
        }
//        List of Ingredients
        Row (modifier = Modifier.height(IntrinsicSize.Min).padding(start = 15.dp)) {
            Text(
                text = "Ingredients",
                textDecoration = TextDecoration.Underline,
                color = Color.DarkGray,
                fontSize = 15.sp,
            )
        }
        Card(colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant),
            modifier = Modifier.padding(10.dp)
        ) {
            Text(
                text = "1 tablespoon olive oil\n" +
                        "4 skinless, boneless chicken thighs, cut into small pieces\n" +
                        "1 onion, cut in half and sliced\n" +
                        "2 cups dashi stock, made with dashi powder\n" +
                        "¼ cup soy sauce\n" +
                        "3 tablespoons mirin (Japanese rice wine)\n" +
                        "3 tablespoons brown sugar\n" +
                        "4 large eggs\n" +
                        "4 cups hot cooked white rice",
                modifier = Modifier
                    .padding(10.dp),
                textAlign = TextAlign.Justify,
                fontSize = 10.sp,
                lineHeight = 1.15.em
            )
        }

//        Instructions
        Row (modifier = Modifier.height(IntrinsicSize.Min).padding(start = 10.dp)) {
            Text(
                text = "Instructions",
                textDecoration = TextDecoration.Underline,
                color = Color.DarkGray,
                fontSize = 15.sp,
            )
        }
//        Step 1
        Card(colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant),
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = "STEP 1",
                fontSize = 12.sp,
                color = Color.Blue,
                modifier = Modifier.padding(start = 10.dp, top = 10.dp))
            Text(
                text = "Heat oil in a large skillet over medium heat. Add chicken and cook until beginning to brown, about 5 minutes. Add onion; cook and stir until onion is translucent, about 5 minutes.",
                textAlign = TextAlign.Justify,
                fontSize = 10.sp,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
                lineHeight = 1.15.em
            )
        }

//        Step 2
        Card(colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant),
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = "STEP 2",
                fontSize = 12.sp,
                color = Color.Blue,
                modifier = Modifier.padding(start = 10.dp, top = 10.dp))
            Text(
                text = "Pour in stock, then whisk in soy sauce, mirin, and brown sugar; stir until sugar dissolves. Bring to a boil, then lower heat and simmer until slightly reduced, about 10 minutes.",
                textAlign = TextAlign.Justify,
                fontSize = 10.sp,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
                lineHeight = 1.15.em
            )
        }

//        Step 3
        Card(colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant),
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = "STEP 3",
                fontSize = 12.sp,
                color = Color.Blue,
                modifier = Modifier.padding(start = 10.dp, top = 10.dp))
            Text(
                text = "Whisk eggs in a bowl until well-beaten, then pour into the hot stock mixture. Cover the skillet, reduce the heat, and steam until egg is cooked, about 5 minutes. Remove from the heat.",
                textAlign = TextAlign.Justify,
                fontSize = 10.sp,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
                lineHeight = 1.15.em
            )
        }
//        Step 4
        Card(colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant),
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = "STEP 4",
                fontSize = 12.sp,
                color = Color.Blue,
                modifier = Modifier.padding(start = 10.dp, top = 10.dp))
            Text(
                text = "Divide rice among 4 deep soup bowls and top with equal amounts of the soup mixture.",
                textAlign = TextAlign.Justify,
                fontSize = 10.sp,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
                lineHeight = 1.15.em
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment2_Q1Theme {
        Recipe(modifier = Modifier)

    }
}