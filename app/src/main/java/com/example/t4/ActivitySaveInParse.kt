package com.example.t4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.parse.ParseObject
import com.parse.ParseQuery
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find

class ActivitySaveInParse : AppCompatActivity(){
    private lateinit var mText: TextView
    private lateinit var mValue: TextView

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save_in_parse)

    /*
        val value = mValue.text.toString()


        val studentObject = ParseObject( "Tarea")
        studentObject.put("expediente", "is685434")
        studentObject.put("valor", value)
        studentObject.saveInBackground()

        mText = find(R.id.parse_val)
        mText.setOnClickListener {
            doAsync {
                ParseQuery<ParseObject>( "TestConnection")
                    .whereEqualTo("objectId", "3JfGRfaMsu")
                    .getFirstInBackground { obj, e->
                        if (e == null)
                            mText.text = obj["hiddenValue"] as String
                        else
                            error {e}

                    }
            }
        }
     */
    }
}