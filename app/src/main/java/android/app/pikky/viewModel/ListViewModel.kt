package android.app.pikky.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {
    private val _listItems = MutableLiveData<ArrayList<String>>()
    val listItems: LiveData<ArrayList<String>> = _listItems

    fun addList(unconvertedItems: String) {
        // TODO: implement logic to convert separated commas to a list
        val convertedItems = unconvertedItems.split(",")
        Log.d("CheckList", convertedItems.toString())
    }
}