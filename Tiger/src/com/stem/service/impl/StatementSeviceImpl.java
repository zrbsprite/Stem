package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.StatementMapper;
import com.stem.entity.Statement;
import com.stem.entity.StatementExample;
import com.stem.service.StatementService;

/**
 * 描述：对于废弃的方法请不要使用<br/>
 * 作者：stem zhang <br/>
 * 修改日期：2015年8月20日 - 下午4:39:55<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
@Service("statementService")
public class StatementSeviceImpl implements StatementService {

	private StatementMapper statementMapper;

	@Override
	public List<Statement> list(StatementExample example){

		return this.statementMapper.selectByExample(example);
	}

	@Override
	@Deprecated
	public Statement getByPK(Integer id){

		return null;
	}

	@Override
	public int getTotal(StatementExample example){

		return this.statementMapper.countByExample(example);
	}

	@Override
	public int update(Statement model,StatementExample example){

		return this.statementMapper.updateByExample(model,example);
	}

	@Override
	@Deprecated
	public int updateByPK(Statement model){
		return 0;
	}

	@Override
	@Deprecated
	public int deleteByPK(Integer id){

		return 0;
	}

	@Override
	public int delete(StatementExample example){

		return this.statementMapper.deleteByExample(example);
	}

	@Override
	public int add(Statement model){

		return this.statementMapper.insert(model);
	}

	@Resource
	public void setStatementMapper(StatementMapper statementMapper){

		this.statementMapper = statementMapper;
	}

}
