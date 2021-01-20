package com.sureli.crm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDictionaryExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andRowIdIsNull() {
            addCriterion("row_id is null");
            return (Criteria) this;
        }

        public Criteria andRowIdIsNotNull() {
            addCriterion("row_id is not null");
            return (Criteria) this;
        }

        public Criteria andRowIdEqualTo(Long value) {
            addCriterion("row_id =", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotEqualTo(Long value) {
            addCriterion("row_id <>", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdGreaterThan(Long value) {
            addCriterion("row_id >", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("row_id >=", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLessThan(Long value) {
            addCriterion("row_id <", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLessThanOrEqualTo(Long value) {
            addCriterion("row_id <=", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdIn(List<Long> values) {
            addCriterion("row_id in", values, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotIn(List<Long> values) {
            addCriterion("row_id not in", values, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdBetween(Long value1, Long value2) {
            addCriterion("row_id between", value1, value2, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotBetween(Long value1, Long value2) {
            addCriterion("row_id not between", value1, value2, "rowId");
            return (Criteria) this;
        }

        public Criteria andDictionaryParentIdIsNull() {
            addCriterion("dictionary_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryParentIdIsNotNull() {
            addCriterion("dictionary_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryParentIdEqualTo(Long value) {
            addCriterion("dictionary_parent_id =", value, "dictionaryParentId");
            return (Criteria) this;
        }

        public Criteria andDictionaryParentIdNotEqualTo(Long value) {
            addCriterion("dictionary_parent_id <>", value, "dictionaryParentId");
            return (Criteria) this;
        }

        public Criteria andDictionaryParentIdGreaterThan(Long value) {
            addCriterion("dictionary_parent_id >", value, "dictionaryParentId");
            return (Criteria) this;
        }

        public Criteria andDictionaryParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dictionary_parent_id >=", value, "dictionaryParentId");
            return (Criteria) this;
        }

        public Criteria andDictionaryParentIdLessThan(Long value) {
            addCriterion("dictionary_parent_id <", value, "dictionaryParentId");
            return (Criteria) this;
        }

        public Criteria andDictionaryParentIdLessThanOrEqualTo(Long value) {
            addCriterion("dictionary_parent_id <=", value, "dictionaryParentId");
            return (Criteria) this;
        }

        public Criteria andDictionaryParentIdIn(List<Long> values) {
            addCriterion("dictionary_parent_id in", values, "dictionaryParentId");
            return (Criteria) this;
        }

        public Criteria andDictionaryParentIdNotIn(List<Long> values) {
            addCriterion("dictionary_parent_id not in", values, "dictionaryParentId");
            return (Criteria) this;
        }

        public Criteria andDictionaryParentIdBetween(Long value1, Long value2) {
            addCriterion("dictionary_parent_id between", value1, value2, "dictionaryParentId");
            return (Criteria) this;
        }

        public Criteria andDictionaryParentIdNotBetween(Long value1, Long value2) {
            addCriterion("dictionary_parent_id not between", value1, value2, "dictionaryParentId");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueIsNull() {
            addCriterion("dictionary_value is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueIsNotNull() {
            addCriterion("dictionary_value is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueEqualTo(String value) {
            addCriterion("dictionary_value =", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueNotEqualTo(String value) {
            addCriterion("dictionary_value <>", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueGreaterThan(String value) {
            addCriterion("dictionary_value >", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_value >=", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueLessThan(String value) {
            addCriterion("dictionary_value <", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueLessThanOrEqualTo(String value) {
            addCriterion("dictionary_value <=", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueLike(String value) {
            addCriterion("dictionary_value like", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueNotLike(String value) {
            addCriterion("dictionary_value not like", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueIn(List<String> values) {
            addCriterion("dictionary_value in", values, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueNotIn(List<String> values) {
            addCriterion("dictionary_value not in", values, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueBetween(String value1, String value2) {
            addCriterion("dictionary_value between", value1, value2, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueNotBetween(String value1, String value2) {
            addCriterion("dictionary_value not between", value1, value2, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderIsNull() {
            addCriterion("dictionary_order is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderIsNotNull() {
            addCriterion("dictionary_order is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderEqualTo(Integer value) {
            addCriterion("dictionary_order =", value, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderNotEqualTo(Integer value) {
            addCriterion("dictionary_order <>", value, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderGreaterThan(Integer value) {
            addCriterion("dictionary_order >", value, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("dictionary_order >=", value, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderLessThan(Integer value) {
            addCriterion("dictionary_order <", value, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderLessThanOrEqualTo(Integer value) {
            addCriterion("dictionary_order <=", value, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderIn(List<Integer> values) {
            addCriterion("dictionary_order in", values, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderNotIn(List<Integer> values) {
            addCriterion("dictionary_order not in", values, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderBetween(Integer value1, Integer value2) {
            addCriterion("dictionary_order between", value1, value2, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("dictionary_order not between", value1, value2, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andActiveFlagIsNull() {
            addCriterion("active_flag is null");
            return (Criteria) this;
        }

        public Criteria andActiveFlagIsNotNull() {
            addCriterion("active_flag is not null");
            return (Criteria) this;
        }

        public Criteria andActiveFlagEqualTo(Integer value) {
            addCriterion("active_flag =", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagNotEqualTo(Integer value) {
            addCriterion("active_flag <>", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagGreaterThan(Integer value) {
            addCriterion("active_flag >", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_flag >=", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagLessThan(Integer value) {
            addCriterion("active_flag <", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagLessThanOrEqualTo(Integer value) {
            addCriterion("active_flag <=", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagIn(List<Integer> values) {
            addCriterion("active_flag in", values, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagNotIn(List<Integer> values) {
            addCriterion("active_flag not in", values, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagBetween(Integer value1, Integer value2) {
            addCriterion("active_flag between", value1, value2, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("active_flag not between", value1, value2, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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