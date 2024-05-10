package com.sanapp.pi

import android.content.Intent
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.Nullable
import android.widget.EditText
import android.view.ViewGroup


class MainActivity : AppCompatActivity() {
    private val PICK_IMAGE_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fotoUsuario = findViewById<ImageView>(R.id.usuariolindo)
        fotoUsuario.setOnClickListener { usuariolindo() }

        val pano = findViewById<ImageView>(R.id.pano)
        pano.setOnClickListener { fonfocambio() }

        val Subirimagen = findViewById<Button>(R.id.Subirimagen)
        Subirimagen.setOnClickListener { Subirimagen() }

        val Guardar = findViewById<Button>(R.id.Guardar)
        Guardar.setOnClickListener {
            showConfirmationDialog() // Muestra el pop-up cuando se hace clic en "Subirimagen"

        }
        val nombreEditText = findViewById<EditText>(R.id.Nombre)
        val edadEditText = findViewById<EditText>(R.id.Edad)
        val usuarioEditText = findViewById<EditText>(R.id.Usuario)
        val numeroEditText = findViewById<EditText>(R.id.Número)
        val documentoEditText = findViewById<EditText>(R.id.documento)
        val descripcionEditText = findViewById<EditText>(R.id.Descripción)
        val nombreMascotaEditText = findViewById<EditText>(R.id.NombreMascota)
        val razaMascotaEditText = findViewById<EditText>(R.id.RazaMascota)
        val cambiarContraseñaEditText = findViewById<EditText>(R.id.CambiarContraseña)

        val buttonCancel = findViewById<Button>(R.id.Cancelar)

        // Configura el evento de clic para el botón "Cancelar"
        buttonCancel.setOnClickListener {
            // Borra el contenido de los campos
            nombreEditText.setText("")
            edadEditText.setText("")
            usuarioEditText.setText("")
            numeroEditText.setText("")
            documentoEditText.setText("")
            descripcionEditText.setText("")
            nombreMascotaEditText.setText("")
            razaMascotaEditText.setText("")
            cambiarContraseñaEditText.setText("")

        }
    }
    private fun usuariolindo() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(
            Intent.createChooser(intent, "Selecciona una imagen"),
            PICK_IMAGE_REQUEST
        )
    }
    private fun showConfirmationDialog() {
        val builder = AlertDialog.Builder(this)
         builder.setTitle("Datos Actualizados")
        builder.setMessage("Se actualizaron sus datos")
        builder.setPositiveButton("Cerrar") { dialog, _ ->
            dialog.dismiss() // Cierra el diálogo
        }
        val dialog = builder.create()
        dialog.show() // Muestra el diálogo
    }

    fun fonfocambio() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(
            Intent.createChooser(intent, "Selecciona una imagen"),
            PICK_IMAGE_REQUEST
        )
    }
    fun Subirimagen() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(
            Intent.createChooser(intent, "Selecciona una imagen"),
            PICK_IMAGE_REQUEST
        )
    }
}