package com.example.gridfragmentlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val POSITION = "position"


/**
 * A simple [Fragment] subclass.
 * Use the [RegisterFrag.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegisterFrag : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    internal var saxeli: String? = null
    private var agwera: String? = null

    private var imageView: ImageView? =null

    private var positionInt: Int=0
    private var imgInt:Int=0



    lateinit var textView: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView
    lateinit var textView4: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
            positionInt=it.getInt(POSITION)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView=view.findViewById(R.id.textView2)
        textView4=view.findViewById(R.id.textView5)
        textView2=view.findViewById(R.id.textView3)
        textView3=view.findViewById(R.id.textView4)
        imageView=view.findViewById((R.id.imageView))
        imageView?.setImageResource(imgInt);


        textView.setText(saxeli)
        textView2.setText("Total screens" /* +ViewPagerAdapter.CARD_ITEM_SIZE*/)
        textView3.setText("position "+ positionInt.toString())
        textView4.setText(agwera)



    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RegisterFrag.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1:Int, saxeli:String, agwera:String, surati: Int) =
            RegisterFrag().apply {
                this.saxeli=saxeli
                this.agwera=agwera
                this.imgInt=surati

                arguments = Bundle().apply {
                    putInt(POSITION, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}