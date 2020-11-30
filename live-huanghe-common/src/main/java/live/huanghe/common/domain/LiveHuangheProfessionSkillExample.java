package live.huanghe.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveHuangheProfessionSkillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveHuangheProfessionSkillExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSkillIdIsNull() {
            addCriterion("skill_id is null");
            return (Criteria) this;
        }

        public Criteria andSkillIdIsNotNull() {
            addCriterion("skill_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkillIdEqualTo(Integer value) {
            addCriterion("skill_id =", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotEqualTo(Integer value) {
            addCriterion("skill_id <>", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdGreaterThan(Integer value) {
            addCriterion("skill_id >", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("skill_id >=", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdLessThan(Integer value) {
            addCriterion("skill_id <", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdLessThanOrEqualTo(Integer value) {
            addCriterion("skill_id <=", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdIn(List<Integer> values) {
            addCriterion("skill_id in", values, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotIn(List<Integer> values) {
            addCriterion("skill_id not in", values, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdBetween(Integer value1, Integer value2) {
            addCriterion("skill_id between", value1, value2, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("skill_id not between", value1, value2, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillNameIsNull() {
            addCriterion("skill_name is null");
            return (Criteria) this;
        }

        public Criteria andSkillNameIsNotNull() {
            addCriterion("skill_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkillNameEqualTo(String value) {
            addCriterion("skill_name =", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotEqualTo(String value) {
            addCriterion("skill_name <>", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameGreaterThan(String value) {
            addCriterion("skill_name >", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameGreaterThanOrEqualTo(String value) {
            addCriterion("skill_name >=", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameLessThan(String value) {
            addCriterion("skill_name <", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameLessThanOrEqualTo(String value) {
            addCriterion("skill_name <=", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameLike(String value) {
            addCriterion("skill_name like", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotLike(String value) {
            addCriterion("skill_name not like", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameIn(List<String> values) {
            addCriterion("skill_name in", values, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotIn(List<String> values) {
            addCriterion("skill_name not in", values, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameBetween(String value1, String value2) {
            addCriterion("skill_name between", value1, value2, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotBetween(String value1, String value2) {
            addCriterion("skill_name not between", value1, value2, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillContentIsNull() {
            addCriterion("skill_content is null");
            return (Criteria) this;
        }

        public Criteria andSkillContentIsNotNull() {
            addCriterion("skill_content is not null");
            return (Criteria) this;
        }

        public Criteria andSkillContentEqualTo(String value) {
            addCriterion("skill_content =", value, "skillContent");
            return (Criteria) this;
        }

        public Criteria andSkillContentNotEqualTo(String value) {
            addCriterion("skill_content <>", value, "skillContent");
            return (Criteria) this;
        }

        public Criteria andSkillContentGreaterThan(String value) {
            addCriterion("skill_content >", value, "skillContent");
            return (Criteria) this;
        }

        public Criteria andSkillContentGreaterThanOrEqualTo(String value) {
            addCriterion("skill_content >=", value, "skillContent");
            return (Criteria) this;
        }

        public Criteria andSkillContentLessThan(String value) {
            addCriterion("skill_content <", value, "skillContent");
            return (Criteria) this;
        }

        public Criteria andSkillContentLessThanOrEqualTo(String value) {
            addCriterion("skill_content <=", value, "skillContent");
            return (Criteria) this;
        }

        public Criteria andSkillContentLike(String value) {
            addCriterion("skill_content like", value, "skillContent");
            return (Criteria) this;
        }

        public Criteria andSkillContentNotLike(String value) {
            addCriterion("skill_content not like", value, "skillContent");
            return (Criteria) this;
        }

        public Criteria andSkillContentIn(List<String> values) {
            addCriterion("skill_content in", values, "skillContent");
            return (Criteria) this;
        }

        public Criteria andSkillContentNotIn(List<String> values) {
            addCriterion("skill_content not in", values, "skillContent");
            return (Criteria) this;
        }

        public Criteria andSkillContentBetween(String value1, String value2) {
            addCriterion("skill_content between", value1, value2, "skillContent");
            return (Criteria) this;
        }

        public Criteria andSkillContentNotBetween(String value1, String value2) {
            addCriterion("skill_content not between", value1, value2, "skillContent");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSkillCreateTimeIsNull() {
            addCriterion("skill_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSkillCreateTimeIsNotNull() {
            addCriterion("skill_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSkillCreateTimeEqualTo(Date value) {
            addCriterion("skill_create_time =", value, "skillCreateTime");
            return (Criteria) this;
        }

        public Criteria andSkillCreateTimeNotEqualTo(Date value) {
            addCriterion("skill_create_time <>", value, "skillCreateTime");
            return (Criteria) this;
        }

        public Criteria andSkillCreateTimeGreaterThan(Date value) {
            addCriterion("skill_create_time >", value, "skillCreateTime");
            return (Criteria) this;
        }

        public Criteria andSkillCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("skill_create_time >=", value, "skillCreateTime");
            return (Criteria) this;
        }

        public Criteria andSkillCreateTimeLessThan(Date value) {
            addCriterion("skill_create_time <", value, "skillCreateTime");
            return (Criteria) this;
        }

        public Criteria andSkillCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("skill_create_time <=", value, "skillCreateTime");
            return (Criteria) this;
        }

        public Criteria andSkillCreateTimeIn(List<Date> values) {
            addCriterion("skill_create_time in", values, "skillCreateTime");
            return (Criteria) this;
        }

        public Criteria andSkillCreateTimeNotIn(List<Date> values) {
            addCriterion("skill_create_time not in", values, "skillCreateTime");
            return (Criteria) this;
        }

        public Criteria andSkillCreateTimeBetween(Date value1, Date value2) {
            addCriterion("skill_create_time between", value1, value2, "skillCreateTime");
            return (Criteria) this;
        }

        public Criteria andSkillCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("skill_create_time not between", value1, value2, "skillCreateTime");
            return (Criteria) this;
        }

        public Criteria andSkillUpdateTimeIsNull() {
            addCriterion("skill_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSkillUpdateTimeIsNotNull() {
            addCriterion("skill_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSkillUpdateTimeEqualTo(Date value) {
            addCriterion("skill_update_time =", value, "skillUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSkillUpdateTimeNotEqualTo(Date value) {
            addCriterion("skill_update_time <>", value, "skillUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSkillUpdateTimeGreaterThan(Date value) {
            addCriterion("skill_update_time >", value, "skillUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSkillUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("skill_update_time >=", value, "skillUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSkillUpdateTimeLessThan(Date value) {
            addCriterion("skill_update_time <", value, "skillUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSkillUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("skill_update_time <=", value, "skillUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSkillUpdateTimeIn(List<Date> values) {
            addCriterion("skill_update_time in", values, "skillUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSkillUpdateTimeNotIn(List<Date> values) {
            addCriterion("skill_update_time not in", values, "skillUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSkillUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("skill_update_time between", value1, value2, "skillUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSkillUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("skill_update_time not between", value1, value2, "skillUpdateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}