package com.ebankapp.services;

import com.ebankapp.models.ContSpecial;

public interface SAccountService {
    ContSpecial create(ContSpecial contSpecial);
    ContSpecial update(long id, ContSpecial contSpecial);
    void delete(long id);
}
