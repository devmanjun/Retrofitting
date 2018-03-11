package com.mvs.myapplication

import io.reactivex.Observable

/**
 * Created by User on 11-Mar-18.
 */
class SearchRepository(val apiService: GithubApiService) {
    fun searchUsers(location:String, language:String):Observable<Result>{
        return apiService.search("location:$location+language:$language")
    }
}