/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.trino.sql.tree;

import jakarta.annotation.Nullable;

public abstract class AstVisitor<R, C>
{
    public R process(Node node)
    {
        return process(node, null);
    }

    public R process(Node node, @Nullable C context)
    {
        return node.accept(this, context);
    }

    protected R visitNode(Node node, C context)
    {
        return null;
    }

    protected R visitExpression(Expression node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitCurrentDate(CurrentDate node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitCurrentTime(CurrentTime node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitCurrentTimestamp(CurrentTimestamp node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitLocalTime(LocalTime node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitLocalTimestamp(LocalTimestamp node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitExtract(Extract node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitArithmeticBinary(ArithmeticBinaryExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitBetweenPredicate(BetweenPredicate node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitCoalesceExpression(CoalesceExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitComparisonExpression(ComparisonExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitLiteral(Literal node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitDoubleLiteral(DoubleLiteral node, C context)
    {
        return visitLiteral(node, context);
    }

    protected R visitDecimalLiteral(DecimalLiteral node, C context)
    {
        return visitLiteral(node, context);
    }

    protected R visitStatement(Statement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitPrepare(Prepare node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDeallocate(Deallocate node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitExecute(Execute node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitExecuteImmediate(ExecuteImmediate node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDescribeOutput(DescribeOutput node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDescribeInput(DescribeInput node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitQuery(Query node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitExplain(Explain node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitExplainAnalyze(ExplainAnalyze node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitShowTables(ShowTables node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitShowSchemas(ShowSchemas node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitShowCatalogs(ShowCatalogs node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitShowColumns(ShowColumns node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitShowStats(ShowStats node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitShowCreate(ShowCreate node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitShowFunctions(ShowFunctions node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitUse(Use node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitShowSession(ShowSession node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitSetSession(SetSession node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitResetSession(ResetSession node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitSetSessionAuthorization(SetSessionAuthorization node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitResetSessionAuthorization(ResetSessionAuthorization node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitGenericLiteral(GenericLiteral node, C context)
    {
        return visitLiteral(node, context);
    }

    protected R visitExplainOption(ExplainOption node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitWith(With node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitWithQuery(WithQuery node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitSelect(Select node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitRelation(Relation node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitQueryBody(QueryBody node, C context)
    {
        return visitRelation(node, context);
    }

    protected R visitOrderBy(OrderBy node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitOffset(Offset node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitFetchFirst(FetchFirst node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitLimit(Limit node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitAllRows(AllRows node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitQuerySpecification(QuerySpecification node, C context)
    {
        return visitQueryBody(node, context);
    }

    protected R visitSetOperation(SetOperation node, C context)
    {
        return visitQueryBody(node, context);
    }

    protected R visitUnion(Union node, C context)
    {
        return visitSetOperation(node, context);
    }

    protected R visitIntersect(Intersect node, C context)
    {
        return visitSetOperation(node, context);
    }

    protected R visitExcept(Except node, C context)
    {
        return visitSetOperation(node, context);
    }

    protected R visitWhenClause(WhenClause node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitIntervalLiteral(IntervalLiteral node, C context)
    {
        return visitLiteral(node, context);
    }

    protected R visitInPredicate(InPredicate node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitFunctionCall(FunctionCall node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitProcessingMode(ProcessingMode node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitWindowOperation(WindowOperation node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitLambdaExpression(LambdaExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitSimpleCaseExpression(SimpleCaseExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitStringLiteral(StringLiteral node, C context)
    {
        return visitLiteral(node, context);
    }

    protected R visitBinaryLiteral(BinaryLiteral node, C context)
    {
        return visitLiteral(node, context);
    }

    protected R visitBooleanLiteral(BooleanLiteral node, C context)
    {
        return visitLiteral(node, context);
    }

    protected R visitInListExpression(InListExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitIdentifier(Identifier node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitDereferenceExpression(DereferenceExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitTrim(Trim node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitNullIfExpression(NullIfExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitIfExpression(IfExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitNullLiteral(NullLiteral node, C context)
    {
        return visitLiteral(node, context);
    }

    protected R visitArithmeticUnary(ArithmeticUnaryExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitNotExpression(NotExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitSelectItem(SelectItem node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitSingleColumn(SingleColumn node, C context)
    {
        return visitSelectItem(node, context);
    }

    protected R visitAllColumns(AllColumns node, C context)
    {
        return visitSelectItem(node, context);
    }

    protected R visitSearchedCaseExpression(SearchedCaseExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitLikePredicate(LikePredicate node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitIsNotNullPredicate(IsNotNullPredicate node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitIsNullPredicate(IsNullPredicate node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitArray(Array node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitSubscriptExpression(SubscriptExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitLongLiteral(LongLiteral node, C context)
    {
        return visitLiteral(node, context);
    }

    protected R visitParameter(Parameter node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitLogicalExpression(LogicalExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitSubqueryExpression(SubqueryExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitSortItem(SortItem node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitTable(Table node, C context)
    {
        return visitQueryBody(node, context);
    }

    protected R visitUnnest(Unnest node, C context)
    {
        return visitRelation(node, context);
    }

    protected R visitLateral(Lateral node, C context)
    {
        return visitRelation(node, context);
    }

    protected R visitValues(Values node, C context)
    {
        return visitQueryBody(node, context);
    }

    protected R visitRow(Row node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitTableSubquery(TableSubquery node, C context)
    {
        return visitQueryBody(node, context);
    }

    protected R visitAliasedRelation(AliasedRelation node, C context)
    {
        return visitRelation(node, context);
    }

    protected R visitSampledRelation(SampledRelation node, C context)
    {
        return visitRelation(node, context);
    }

    protected R visitJoin(Join node, C context)
    {
        return visitRelation(node, context);
    }

    protected R visitExists(ExistsPredicate node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitTryExpression(TryExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitCast(Cast node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitFieldReference(FieldReference node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitWindowReference(WindowReference node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitWindowSpecification(WindowSpecification node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitWindowDefinition(WindowDefinition node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitWindowFrame(WindowFrame node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitFrameBound(FrameBound node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitCallArgument(CallArgument node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitMergeCase(MergeCase node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitMergeInsert(MergeInsert node, C context)
    {
        return visitMergeCase(node, context);
    }

    protected R visitMergeUpdate(MergeUpdate node, C context)
    {
        return visitMergeCase(node, context);
    }

    protected R visitMergeDelete(MergeDelete node, C context)
    {
        return visitMergeCase(node, context);
    }

    protected R visitTableElement(TableElement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitColumnDefinition(ColumnDefinition node, C context)
    {
        return visitTableElement(node, context);
    }

    protected R visitLikeClause(LikeClause node, C context)
    {
        return visitTableElement(node, context);
    }

    protected R visitCreateCatalog(CreateCatalog node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDropCatalog(DropCatalog node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitCreateSchema(CreateSchema node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDropSchema(DropSchema node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitRenameSchema(RenameSchema node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitSetAuthorization(SetAuthorizationStatement node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitCreateTable(CreateTable node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitCreateTableAsSelect(CreateTableAsSelect node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitProperty(Property node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitDropTable(DropTable node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitRenameTable(RenameTable node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitRenameView(RenameView node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitRenameMaterializedView(RenameMaterializedView node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitSetProperties(SetProperties node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitComment(Comment node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitRenameColumn(RenameColumn node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDropColumn(DropColumn node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitAddColumn(AddColumn node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitSetColumnType(SetColumnType node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDropNotNullConstraint(DropNotNullConstraint node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitTableExecute(TableExecute node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitAnalyze(Analyze node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitCreateView(CreateView node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDropView(DropView node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitInsert(Insert node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitRefreshMaterializedView(RefreshMaterializedView node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitCall(Call node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDelete(Delete node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitUpdate(Update node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitUpdateAssignment(UpdateAssignment node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitTruncateTable(TruncateTable node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitStartTransaction(StartTransaction node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitCreateRole(CreateRole node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDropRole(DropRole node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitGrantRoles(GrantRoles node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitRevokeRoles(RevokeRoles node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitSetRole(SetRole node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitGrant(Grant node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDeny(Deny node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitRevoke(Revoke node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitShowGrants(ShowGrants node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitShowRoles(ShowRoles node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitShowRoleGrants(ShowRoleGrants node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitSetPath(SetPath node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitPathSpecification(PathSpecification node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitPathElement(PathElement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitSetTimeZone(SetTimeZone node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitTransactionMode(TransactionMode node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitIsolationLevel(Isolation node, C context)
    {
        return visitTransactionMode(node, context);
    }

    protected R visitTransactionAccessMode(TransactionAccessMode node, C context)
    {
        return visitTransactionMode(node, context);
    }

    protected R visitCommit(Commit node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitRollback(Rollback node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitAtTimeZone(AtTimeZone node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitGroupBy(GroupBy node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitGroupingElement(GroupingElement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitGroupingSets(GroupingSets node, C context)
    {
        return visitGroupingElement(node, context);
    }

    protected R visitSimpleGroupBy(SimpleGroupBy node, C context)
    {
        return visitGroupingElement(node, context);
    }

    protected R visitAutoGroupBy(AutoGroupBy node, C context)
    {
        return visitGroupingElement(node, context);
    }

    protected R visitQuantifiedComparisonExpression(QuantifiedComparisonExpression node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitLambdaArgumentDeclaration(LambdaArgumentDeclaration node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitGroupingOperation(GroupingOperation node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitCurrentCatalog(CurrentCatalog node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitCurrentSchema(CurrentSchema node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitCurrentUser(CurrentUser node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitCurrentPath(CurrentPath node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitFormat(Format node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitDataType(DataType node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitRowDataType(RowDataType node, C context)
    {
        return visitDataType(node, context);
    }

    protected R visitGenericDataType(GenericDataType node, C context)
    {
        return visitDataType(node, context);
    }

    protected R visitRowField(RowDataType.Field node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitDataTypeParameter(DataTypeParameter node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitNumericTypeParameter(NumericParameter node, C context)
    {
        return visitDataTypeParameter(node, context);
    }

    protected R visitTypeParameter(TypeParameter node, C context)
    {
        return visitDataTypeParameter(node, context);
    }

    protected R visitIntervalDataType(IntervalDayTimeDataType node, C context)
    {
        return visitDataType(node, context);
    }

    protected R visitDateTimeType(DateTimeDataType node, C context)
    {
        return visitDataType(node, context);
    }

    protected R visitCreateMaterializedView(CreateMaterializedView node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDropMaterializedView(DropMaterializedView node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitMerge(Merge node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitMeasureDefinition(MeasureDefinition node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitSkipTo(SkipTo node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitPatternSearchMode(PatternSearchMode node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitSubsetDefinition(SubsetDefinition node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitVariableDefinition(VariableDefinition node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitPatternRecognitionRelation(PatternRecognitionRelation node, C context)
    {
        return visitRelation(node, context);
    }

    protected R visitRowPattern(RowPattern node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitPatternAlternation(PatternAlternation node, C context)
    {
        return visitRowPattern(node, context);
    }

    protected R visitPatternConcatenation(PatternConcatenation node, C context)
    {
        return visitRowPattern(node, context);
    }

    protected R visitQuantifiedPattern(QuantifiedPattern node, C context)
    {
        return visitRowPattern(node, context);
    }

    protected R visitAnchorPattern(AnchorPattern node, C context)
    {
        return visitRowPattern(node, context);
    }

    protected R visitEmptyPattern(EmptyPattern node, C context)
    {
        return visitRowPattern(node, context);
    }

    protected R visitExcludedPattern(ExcludedPattern node, C context)
    {
        return visitRowPattern(node, context);
    }

    protected R visitPatternPermutation(PatternPermutation node, C context)
    {
        return visitRowPattern(node, context);
    }

    protected R visitPatternVariable(PatternVariable node, C context)
    {
        return visitRowPattern(node, context);
    }

    protected R visitPatternQuantifier(PatternQuantifier node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitZeroOrMoreQuantifier(ZeroOrMoreQuantifier node, C context)
    {
        return visitPatternQuantifier(node, context);
    }

    protected R visitOneOrMoreQuantifier(OneOrMoreQuantifier node, C context)
    {
        return visitPatternQuantifier(node, context);
    }

    protected R visitZeroOrOneQuantifier(ZeroOrOneQuantifier node, C context)
    {
        return visitPatternQuantifier(node, context);
    }

    protected R visitRangeQuantifier(RangeQuantifier node, C context)
    {
        return visitPatternQuantifier(node, context);
    }

    protected R visitQueryPeriod(QueryPeriod node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitTableFunctionInvocation(TableFunctionInvocation node, C context)
    {
        return visitRelation(node, context);
    }

    protected R visitTableFunctionArgument(TableFunctionArgument node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitTableArgument(TableFunctionTableArgument node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitDescriptorArgument(TableFunctionDescriptorArgument node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitDescriptor(Descriptor node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitDescriptorField(DescriptorField node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitJsonExists(JsonExists node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitJsonValue(JsonValue node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitJsonQuery(JsonQuery node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitJsonPathInvocation(JsonPathInvocation node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitJsonObject(JsonObject node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitJsonObjectMember(JsonObjectMember node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitJsonArray(JsonArray node, C context)
    {
        return visitExpression(node, context);
    }

    protected R visitJsonArrayElement(JsonArrayElement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitEmptyTableTreatment(EmptyTableTreatment node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitJsonTable(JsonTable node, C context)
    {
        return visitRelation(node, context);
    }

    protected R visitOrdinalityColumn(OrdinalityColumn node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitValueColumn(ValueColumn node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitQueryColumn(QueryColumn node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitNestedColumns(NestedColumns node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitPlanParentChild(PlanParentChild node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitPlanSiblings(PlanSiblings node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitPlanLeaf(PlanLeaf node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitJsonTableDefaultPlan(JsonTableDefaultPlan node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitCreateFunction(CreateFunction node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDropFunction(DropFunction node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitCreateTag(CreateTag node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitReplaceTag(ReplaceTag node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitDropTag(DropTag node, C context)
    {
        return visitStatement(node, context);
    }

    protected R visitFunctionSpecification(FunctionSpecification node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitSessionProperty(SessionProperty node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitParameterDeclaration(ParameterDeclaration node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitReturnClause(ReturnsClause node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitLanguageCharacteristic(LanguageCharacteristic node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitDeterministicCharacteristic(DeterministicCharacteristic node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitNullInputCharacteristic(NullInputCharacteristic node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitSecurityCharacteristic(SecurityCharacteristic node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitCommentCharacteristic(CommentCharacteristic node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitPropertiesCharacteristic(PropertiesCharacteristic node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitReturnStatement(ReturnStatement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitCompoundStatement(CompoundStatement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitVariableDeclaration(VariableDeclaration node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitAssignmentStatement(AssignmentStatement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitCaseStatement(CaseStatement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitCaseStatementWhenClause(CaseStatementWhenClause node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitIfStatement(IfStatement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitElseClause(ElseClause node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitElseIfClause(ElseIfClause node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitIterateStatement(IterateStatement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitLeaveStatement(LeaveStatement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitWhileStatement(WhileStatement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitLoopStatement(LoopStatement node, C context)
    {
        return visitNode(node, context);
    }

    protected R visitRepeatStatement(RepeatStatement node, C context)
    {
        return visitNode(node, context);
    }
}
