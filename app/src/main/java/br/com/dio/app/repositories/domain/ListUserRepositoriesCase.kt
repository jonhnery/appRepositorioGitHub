package br.com.dio.app.repositories.domain

import br.com.dio.app.repositories.core.UseCase
import br.com.dio.app.repositories.data.Repositores.RepoRepositories
import br.com.dio.app.repositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesCase(
    private val repositories: RepoRepositories
) : UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repositories.listRepoRepositories(param)
    }

}