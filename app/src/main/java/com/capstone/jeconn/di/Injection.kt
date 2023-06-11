package com.capstone.jeconn.di

import android.content.Context
import com.capstone.jeconn.repository.AuthRepository
import com.capstone.jeconn.repository.ProfileRepository
import com.capstone.jeconn.repository.VacanciesRepository

object Injection {
    fun provideAuthRepository(context: Context) = AuthRepository(context)

    fun provideProfileRepository(context: Context) = ProfileRepository(context)

    fun provideVacanciesRepository(context: Context) = VacanciesRepository(context)
}