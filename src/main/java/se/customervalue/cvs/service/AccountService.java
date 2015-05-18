package se.customervalue.cvs.service;

import org.springframework.scheduling.annotation.Scheduled;
import se.customervalue.cvs.api.exception.*;
import se.customervalue.cvs.api.representation.*;
import se.customervalue.cvs.api.representation.domain.*;
import se.customervalue.cvs.domain.Company;

import java.util.List;

public interface AccountService {
	EmployeeRepresentation login(LoginCredentialsRepresentation credentials) throws EmployeeNotFoundException, InvalidLoginCredentialsException, LoginTriesLimitExceededException, UnattachedEmployeeException;
	APIResponseRepresentation resetPassword(PasswordResetCredentialsRepresentation credentials) throws EmployeeNotFoundException;
	APIResponseRepresentation register(RegistrationInfoRepresentation registrationInfo) throws EmployeeAlreadyExistsException, CompanyAlreadyExistsException;
	APIResponseRepresentation activate(ActivationKeyRepresentation activationKey) throws ActivationKeyExpiredException;
	List<EmployeeRepresentation> getEmployees(EmployeeRepresentation loggedInEmployee);
	EmployeeRepresentation getEmployee(int employeeId, EmployeeRepresentation loggedInEmployee) throws UnauthorizedResourceAccess, EmployeeNotFoundException;
	APIResponseRepresentation toggleEmployeeStatus(int employeeId, EmployeeRepresentation loggedInEmployee) throws UnauthorizedResourceAccess, EmployeeNotFoundException;
	List<CompanyRepresentation> getCompanies(EmployeeRepresentation loggedInEmployee);
	List<RoleRepresentation> getRoles(EmployeeRepresentation loggedInEmployee);
	List<CountryRepresentation> getCountries();

	APIResponseRepresentation editEmployee(BasicEmployeeRepresentation editInfo, EmployeeRepresentation loggedInEmployee) throws UnauthorizedResourceAccess, EmployeeEmailAlreadyInUseException;

	@Scheduled
	void cleanUpActivationKeys();
}
