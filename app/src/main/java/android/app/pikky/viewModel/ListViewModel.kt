package android.app.pikky.viewModel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {
    private val _listItems = MutableLiveData<ArrayList<String>>()
    val listItems: LiveData<ArrayList<String>> = _listItems

    fun addList(unconvertedListItems: String) : Boolean{
        // TODO: implement logic to convert separated commas to a list

        try {
            val convertedListItems = unconvertedListItems.split(",")
            _listItems.value = convertedListItems as ArrayList<String>?

            return true

        } catch (e: Exception) {
            e.printStackTrace()
        }

        return false
    }

    fun randomizeList(context: Context) {
        try {
            val selectedItem = _listItems.value?.random()
            Toast.makeText(context, "List randomized successfully! Picked Item : $selectedItem", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            Toast.makeText(context, "Error randomizing list: ${e.message}", Toast.LENGTH_SHORT).show()
        }

    }
}