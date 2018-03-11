package com.mvs.myapplication

/**
 * Created by User on 11-Mar-18.
 */
object SearchRepositoryProvider {
    fun provideSearchRepository(): SearchRepository {
        return SearchRepository(GithubApiService.Factory.create())
    }
}