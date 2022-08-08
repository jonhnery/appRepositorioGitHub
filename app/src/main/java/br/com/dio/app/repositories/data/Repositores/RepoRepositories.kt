package br.com.dio.app.repositories.data.Repositores

import br.com.dio.app.repositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepositories {
    suspend fun listRepoRepositories(user: String): Flow<List<Repo>>

}