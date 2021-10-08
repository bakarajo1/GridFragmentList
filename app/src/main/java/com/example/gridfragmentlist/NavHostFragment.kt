package com.example.gridfragmentlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NavHostFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NavHostFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)


        }
        lateinit var fragment3: Fragment
        lateinit var fragment4: Fragment



        lateinit var imageView: ImageView

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav_host, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //imageView = view.findViewById(R.id.imageView2)

        fragment3 = RegisterFrag.newInstance(0, "jeka", "dzaan avia", R.drawable.android__1_
        )

        fragment4=RegisterFrag.newInstance(1,"roki","dzaan kaia", R.drawable.android__2_,)
        fragment5=RegisterFrag.newInstance(2,"tarzani","dzaan levia", R.drawable.android__3_,)


        fun onc3(view: View) {

         findNavController().navigate(fragment3.id)


        }
        fun onc4(view: View) {
            findNavController().navigate(fragment4.id)


        }
        fun onc5(view: View) {
            findNavController().navigate(fragment5.id)


        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NavHostFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NavHostFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}