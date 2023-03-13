package edu.uksw.fti.pam.pam_activityintent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import edu.uksw.fti.pam.pam_activityintent.models.TodosViewModel
import edu.uksw.fti.pam.pam_activityintent.ui.screns.LoginForm
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val vm = TodosViewModel()
        super.onCreate(savedInstanceState)
        setContent {
            PAM_ActivityIntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoginForm(vm)
                }
            }
        }
    }
}
