package tk.blizz.ssh.dao;

import java.util.List;

import tk.blizz.ssh.model.Role;

public interface RoleDAO extends GenericDAO<Role, Long> {
	/**
	 * find all Roles by role name
	 * 
	 * @param name
	 * @return
	 */
	List<Role> findByRoleName(String name);

}
