package com.penzias.service;

import java.util.List;

import com.penzias.core.interfaces.BasicService;
import com.penzias.entity.SmRoleModular;
import com.penzias.entity.SmRoleModularExample;

public interface SmRoleModularService extends BasicService<SmRoleModularExample, SmRoleModular> {

	Integer addMore(List<SmRoleModular> list);

}