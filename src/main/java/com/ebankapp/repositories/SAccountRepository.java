package com.ebankapp.repositories;

import com.ebankapp.models.ContSpecial;

public interface SAccountRepository {
    ContSpecial create(ContSpecial contSpecial);
    ContSpecial update(ContSpecial contSpecial);
    void delete(ContSpecial contSpecial);

}
