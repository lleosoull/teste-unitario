package com.project.test.adapter.core

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

abstract class GenericAdapter<T : RecyclerView.ViewHolder> : RecyclerView.Adapter<T>() {

    lateinit var context: Context

    fun inflate(@LayoutRes layout: Int, parent: ViewGroup): View {
        context = parent.context

        return LayoutInflater
            .from(context)
            .inflate(layout, parent, false)
    }
}