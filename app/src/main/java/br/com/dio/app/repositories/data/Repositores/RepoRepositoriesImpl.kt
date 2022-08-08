package br.com.dio.app.repositories.data.Repositores

import br.com.dio.app.repositories.data.service.GitHubService
import kotlinx.coroutines.flow.flow


class RepoRepositoriesImpl(private val service: GitHubService) : RepoRepositories {
    override suspend fun listRepoRepositories(user: String) = flow {
        val repoList = service.listRepositores(user)
        emit(repoList)
    }
    }