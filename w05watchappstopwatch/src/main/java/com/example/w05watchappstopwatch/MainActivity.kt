package com.example.w05watchappstopwatch

import android.os.Bundle
import android.os.SystemClock
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.w05watchappstopwatch.databinding.ActivityMainBinding
import java.util.Timer
import java.util.TimerTask
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var time = 0
    private var isRunning = false
    private var timer: Timer? = null
    private var lastTimeBackPressed: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            start()
            binding.btnStart.isEnabled = false
            binding.btnStop.isEnabled = true
        }

        binding.btnStop.setOnClickListener {
            stop()
            binding.btnStart.isEnabled = true
            binding.btnStop.isEnabled = false
        }

        binding.btnReset.setOnClickListener {
            reset()
            binding.btnStart.isEnabled = true
            binding.btnStop.isEnabled = false
        }
    }

    private fun start() {
        isRunning = true
        timer = timer(period = 10) {
            time++
            val minutes = time / 6000
            val seconds = (time % 6000) / 100
            val millis = time % 100

            val timeString = String.format("%02d:%02d.%02d", minutes, seconds, millis)

            runOnUiThread {
                binding.textTime.text = timeString
            }
        }
    }

    private fun stop() {
        isRunning = false
        timer?.cancel()
    }

    private fun reset() {
        stop()
        time = 0
        binding.textTime.text = "00:00"
    }

    override fun onBackPressed() {
        if (System.currentTimeMillis() - lastTimeBackPressed >= 1500) {
            lastTimeBackPressed = System.currentTimeMillis()
            Toast.makeText(this, "'종료하려면 한 번 더 누르세요!!'", Toast.LENGTH_SHORT).show()
        } else {
            finish()
        }
    }
}