package com.penzias.dao;

import java.util.List;

import com.penzias.core.interfaces.BasicMapper;
import com.penzias.entity.SmRoleModular;
import com.penzias.entity.SmRoleModularExample;

public interface SmRoleModularMapper extends BasicMapper<SmRoleModularExample, SmRoleModular>{

	Integer insertBatch(List<SmRoleModular> list);
}