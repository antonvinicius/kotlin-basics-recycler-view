package com.antonvinicius.affirmations

import android.content.Context
import com.antonvinicius.affirmations.adapters.AffirmationAdapter
import com.antonvinicius.affirmations.models.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTest {
    private val context = mock(Context::class.java)

    private val data = listOf(
        Affirmation(R.string.affirmation1, R.drawable.image1),
        Affirmation(R.string.affirmation2, R.drawable.image2)
    )

    private val adapter = AffirmationAdapter(context, data)

    @Test
    fun adapter_size() {
        assertEquals("AffirmationAdapter is not correct size", adapter.itemCount, data.size)
    }
}