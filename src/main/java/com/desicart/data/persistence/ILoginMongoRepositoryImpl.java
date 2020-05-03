package com.desicart.data.persistence;

import com.desicart.data.model.dbUserDetails;

import java.util.List;

public interface ILoginMongoRepositoryImpl {
    List<dbUserDetails> getLogin();
}
