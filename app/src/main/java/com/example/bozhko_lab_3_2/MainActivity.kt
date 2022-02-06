package com.example.bozhko_lab_3_2

<<<<<<< Updated upstream
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
=======
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
>>>>>>> Stashed changes
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
<<<<<<< Updated upstream
=======
import androidx.navigation.ui.R
>>>>>>> Stashed changes
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bozhko_lab_3_2.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
<<<<<<< Updated upstream
    private lateinit var appBarConfiguration: AppBarConfiguration
=======

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
>>>>>>> Stashed changes
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

<<<<<<< Updated upstream
        val binding = ActivityMainBinding.inflate(this.layoutInflater)
=======
        binding = ActivityMainBinding.inflate(layoutInflater)
>>>>>>> Stashed changes
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
<<<<<<< Updated upstream
                R.id.nav_first, R.id.nav_second, R.id.nav_third
=======
                R.id.nav_firstActivity, R.id.nav_secondActivity, R.id.nav_thirdActivity
>>>>>>> Stashed changes
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
<<<<<<< Updated upstream
=======
    }

    override fun onPause() {
        binding.drawerLayout.close()
        super.onPause()
>>>>>>> Stashed changes
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}