//package dev.codcow.guladarahapps.viewModel
//
//import android.app.Application
//import androidx.lifecycle.AndroidViewModel
//import androidx.lifecycle.viewModelScope
//import dev.codcow.guladarahapps.dataModel.GulaDarah
//import dev.codcow.guladarahapps.database.AppDatabase
//import kotlinx.coroutines.flow.SharingStarted
//import kotlinx.coroutines.flow.StateFlow
//import kotlinx.coroutines.flow.stateIn
//import kotlinx.coroutines.launch
//
//class GulaDarahViewModel(application: Application) : AndroidViewModel(application) {
//    private val db = AppDatabase.getDatabase(application)
//    private val dao = db.gulaDarahDao()
//
//    fun insertGulaDarah(date: String, time: String, level: Int) {
//        viewModelScope.launch {
//            dao.insert(GulaDarah(date = date, time = time, level = level))
//        }
//    }
//
//    val gulaDarahList: StateFlow<List<GulaDarah>> = dao.getAllFlow()
//        .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())
//}
