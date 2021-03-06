package com.andriawan.sistempenilaianmahasiswa.domain.usecase.students

import com.andriawan.sistempenilaianmahasiswa.data.usecase.students.DeleteStudentUseCaseImpl
import com.andriawan.sistempenilaianmahasiswa.utils.usecase.FlowUseCase

interface DeleteStudentUseCase: FlowUseCase<DeleteStudentUseCaseImpl.Param, Nothing>