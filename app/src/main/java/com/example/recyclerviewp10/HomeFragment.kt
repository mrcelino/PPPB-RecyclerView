package com.example.recyclerviewp10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewp10.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = binding.rvMovie

        val movieList = listOf(
            Movie(R.drawable.movie_1, "Venom : The Last Dance", "1h 30m","R13+", "Venom 3 adalah film superhero Amerika yang menampilkan karakter Venom, diproduksi oleh Columbia Pictures bekerja sama dengan Marvel Entertainment. Distributed by Sony Pictures Releasing, film ini menjadi film keenam dalam Jagat Spider-Man Sony dan merupakan sekuel bagi film Venom dan Venom: Let There Be Carnage."),
            Movie(R.drawable.movie_2, "DOSA MUSYRIK", "1h 32m", "D17+", "Dosa Musyrik adalah film horor Indonesia terbaru yang akan tayang di bioskop pada 31 Oktober 2024. Film ini mengisahkan tentang konsekuensi dari melakukan dosa besar yang dikenal sebagai musyrik, yang berakar dari kepercayaan dan ajaran dalam agama Islam"),
            Movie(R.drawable.movie_3, "Inside Out 2", "1h 45m", "7+", "Inside Out 2 adalah film animasi remaja Amerika Serikat tahun 2024 yang diproduksi oleh Pixar Animation Studios untuk Walt Disney Pictures. Sekuel dari Inside Out, disutradarai oleh Kelsey Mann, diproduksi oleh Mark Nielsen, dan ditulis oleh Meg LeFauve."),
            Movie(R.drawable.movie_4, "Transformer One", "1h 45m", "R13+", "Transformers One adalah kisah asal-usul Optimus Prime dan Megatron yang tidak biasa, yang awalnya dekat seperti saudara tetapi akhirnya menjadi musuh bebuyutan . Mereka awalnya adalah penambang yang rendah hati (tetapi bersemangat) di planet Cybertron, yang ditakdirkan untuk menjalani kehidupan yang sederhana karena mereka tidak memiliki roda gigi yang diperlukan untuk berubah."),
            Movie(R.drawable.movie_5, "Home Sweet Loan", "1h 52m","R13+", "Perempuan pekerja kantoran bernama Kaluna mendambakan rumah impian. Ia merupakan anak bungsu yang tinggal bersama orang tua dan keluarga kecil kakak-kakaknya. Kondisi rumah yang ramai seringkali membuat Kaluna terganggu dan tidak nyaman. Bahkan beranggap sebagai seorang anak yang menumpang di rumah orang tua. Hampir seluruh kebutuhan rumah dipenuhi sendiri tanpa bantuan kakak-kakaknya"),
            Movie(R.drawable.movie_6, "Agak Laen", "1h 59m", "R13+", "Agak Laen adalah film horor komedi Indonesia tahun 2024 yang disutradarai dan ditulis oleh Muhadkly Acho berdasarkan siniar Agak Laen. Film produksi Imajinari serta Jagartha ini dibintangi oleh personel siniar Agak Laen, yaitu Bene Dion, Oki Rengga, Boris Bokir, dan Indra Jegel.")
        )

        recyclerView.adapter = MovieAdapter(requireContext(), movieList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}