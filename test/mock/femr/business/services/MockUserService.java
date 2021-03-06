package mock.femr.business.services;

import femr.common.dto.ServiceResponse;
import femr.business.services.IUserService;
import femr.data.models.IRole;
import femr.data.models.IUser;

import java.util.List;

public class MockUserService implements IUserService {

    public boolean findByEmailWasCalled = false;
    public String emailPassedIn;
    public IUser findByEmailReturnUser = null;
    public IUser findByIdReturnObject;
    public int idPassedIn;
    public boolean findByIdWasCalled = false;

    @Override
    public ServiceResponse<IUser> createUser(IUser user) {
        return null;
    }

    @Override
    public IUser findByEmail(String email) {
        findByEmailWasCalled = true;
        emailPassedIn = email;
        return findByEmailReturnUser;
    }

    @Override
    public IUser findById(int id) {
        findByIdWasCalled = true;
        idPassedIn = id;
        return findByIdReturnObject;
    }

    @Override
    public ServiceResponse<List<? extends IUser>> findAllUsers(){
        return new ServiceResponse<>();
    }

    @Override
    public ServiceResponse<IUser> update(IUser currentUser, Boolean isNewPassword) {
        return null;
    }

    @Override
    public List<? extends IRole> findRolesForUser(int id) {
        return null;
    }
}

